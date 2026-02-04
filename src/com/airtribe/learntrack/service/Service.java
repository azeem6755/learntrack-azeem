package com.airtribe.learntrack.service;

import java.util.*;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.util.EnrollmentStatus;

import com.airtribe.learntrack.exception.InvalidInputException;
import com.airtribe.learntrack.exception.EntityNotFoundException;

public class Service {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static ArrayList<Course> courseList = new ArrayList<>();
    private static ArrayList<Enrollment> enrollments = new ArrayList<>();

    public static void addStudent() throws InvalidInputException {
        Student student;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Batch: ");
        String batch = scanner.nextLine();
        if (email.equals(" ")) {
            student = new Student(firstName, lastName, batch);
        }
        else{
            student = new Student(firstName, lastName, email, batch);
        }
        studentList.add(student);
        System.out.printf("Added student with id: %d\n", student.getId());

    }

    public static void listStudents() {
        for (Student student : studentList) {
            student.displayID();
        }
    }

    public static Student searchStudent(int studentId) {
        Optional<Student> matchingStudent = studentList.stream().filter(student -> student.getId() == studentId).
                findFirst();
        if (matchingStudent.isPresent()) {
            Student student = matchingStudent.get();
            return student;
        }
        else {
            return null;
        }
    }

    public static void searchStudentId(int studentId) throws EntityNotFoundException {
        Student student = searchStudent(studentId);
        if (student != null) {
            student.display();
        }
        else {
            throw new EntityNotFoundException("Student not found");
        }
    }

    public static void deactivateStudent(int studentId) throws EntityNotFoundException {
        Optional<Student> matchingStudent = studentList.stream().filter(student -> student.getId() == studentId).
                findFirst();
        if (matchingStudent.isPresent()) {
            Student student = matchingStudent.get();
            student.setStatus(false);
        }
        else {
            throw new EntityNotFoundException("Student not found");
        }
    }

    public static void removeStudent(int studentId) throws EntityNotFoundException {
        boolean isRemoved = studentList.removeIf(obj -> obj.getId() == studentId);
        if (isRemoved) {
            System.out.printf("Removed student id: %d\n", studentId);
        }
        else {
            throw new EntityNotFoundException("Student not found");
        }
        listStudents();
    }

    public static void addCourse() throws InvalidInputException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Duration of Course (in weeks): ");
        int duration = scanner.nextInt();

        Course course = new Course(courseName, description, duration);
        courseList.add(course);
        System.out.printf("Added course with id: %d\n", course.getId());
    }

    public static void listCourses() {
        for (Course course: courseList) {
            course.displayId();
        }
    }

    public static Course searchCourse(int courseId) {
        Optional<Course> matchingCourse = courseList.stream().filter(course -> course.getId() == courseId).findFirst();
        if (matchingCourse.isPresent()) {
            return matchingCourse.get();
        }
        else {
            return null;
        }
    }

    public static void changeCourseStatus(int courseId) throws EntityNotFoundException{
        Course course = searchCourse(courseId);
        if (course != null) {
            course.setActiveStatus(!course.getActive());
            System.out.println("Course status changed for " + courseId + "\n");
        }
        else {
            throw new EntityNotFoundException("Course not found.");
        }
    }

    public static void enrollStudent(int studentId, int courseId) {
        Enrollment enrollment = new Enrollment(studentId, courseId);
        enrollments.add(enrollment);
        System.out.printf("Enrollment created for student: %d with ID: %d\n", studentId, enrollment.getId());
    }

    public static void viewEnrollments(int studentId) throws EntityNotFoundException{
        List<Enrollment> matchingEnrollment = enrollments.stream().filter(
                enrollment -> enrollment.getStudentId() == studentId).toList();
        if (!matchingEnrollment.isEmpty()) {
            for (Enrollment enrollment: matchingEnrollment) {
                Student student = searchStudent(studentId);
                Course course = searchCourse(enrollment.getcourseId());
                if (course != null && student != null){
                    System.out.printf("Student Name: %s\n", student.getName());
                    System.out.printf("Course Name: %s\n", course.getCourseName());
                    enrollment.display();
                }
            }
        }
        else {
            throw new EntityNotFoundException("Enrollment not found.");
        }
    }

    public static void changeEnrollmentStatus(int studentId, int courseId) throws EntityNotFoundException{
        Optional<Enrollment> matchingEnrollment = enrollments.stream().filter(
                enrollment -> enrollment.getStudentId() == studentId && enrollment.getcourseId() == courseId).findFirst();
        if (matchingEnrollment.isPresent()) {
            Enrollment enrollment = matchingEnrollment.get();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Mark Complete, 2. Cancel Enrollment");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    enrollment.setEnrollmentStatus(EnrollmentStatus.COMPLETED);
                    break;
                case 2:
                    enrollment.setEnrollmentStatus(EnrollmentStatus.CANCELLED);
                    break;
                default:
                    System.out.println("Invalid Choice.\n");
            }
            System.out.println("Enrollment status changed.\n");
        }
        else {
            throw new EntityNotFoundException("Student Enrollment not found.");
        }
    }

}
