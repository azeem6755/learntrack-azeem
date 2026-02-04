package com.airtribe.learntrack.ui;

import com.airtribe.learntrack.entity.*;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.exception.InvalidInputException;
import com.airtribe.learntrack.service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exitFlag = false;
        int studentId;
        int courseId;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME!");

        while(!exitFlag) {
            System.out.println("1. Add Student 2. List Students 3. Search Student 4. Deactivate Student 5. Remove Student" +
                    " 6. Add Course 7. List Courses 8. Activate/Deactivate Course 9. Enroll Student  10. View Enrollments" +
                    " 11. Change Enrollment Status 12. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try{
                        Service.addStudent();
                    }
                    catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    Service.listStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    try {
                        Service.searchStudentId(studentId);
                    }
                    catch (EntityNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    try{
                        Service.deactivateStudent(studentId);
                    }
                    catch(EntityNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    try{
                        Service.removeStudent(studentId);
                    }
                    catch (EntityNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        Service.addCourse();
                    }
                    catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    Service.listCourses();
                    break;
                case 8:
                    System.out.print("Enter Course ID: ");
                    courseId = scanner.nextInt();
                    try {
                        Service.changeCourseStatus(courseId);
                    }
                    catch (EntityNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    courseId = scanner.nextInt();
                    Service.enrollStudent(studentId, courseId);
                    break;
                case 10:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    try {
                        Service.viewEnrollments(studentId);
                    }
                    catch (EntityNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 11:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    courseId = scanner.nextInt();
                    try {
                        Service.changeEnrollmentStatus(studentId, courseId);
                    }
                    catch (EntityNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 12:
                    System.out.println("Bye!!!");
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Wrong choice! Please enter correct option");
            }
        }
    }
}
