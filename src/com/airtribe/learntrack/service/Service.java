package com.airtribe.learntrack.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;

public class Service {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static ArrayList<Course> courseList = new ArrayList<>();
    private static ArrayList<Enrollment> enrollments = new ArrayList<>();

    public static void addStudent() {
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
            student.display();
        }
    }

    public static void removeStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Studnent ID: ");
        int studentId = sc.nextInt();
        studentList.removeIf(obj -> obj.getId() == studentId);
        System.out.printf("Removed student id: %d\n", studentId);
        listStudents();
    }

    public static void addCourse() {
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

}
