package com.airtribe.learntrack.ui;

import com.airtribe.learntrack.entity.*;
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
                    Service.addStudent();
                    break;
                case 2:
                    Service.listStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    Service.searchStudentId(studentId);
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    Service.deactivateStudent(studentId);
                    break;
                case 5:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    Service.removeStudent(studentId);
                    break;
                case 6:
                    Service.addCourse();
                    break;
                case 7:
                    Service.listCourses();
                    break;
                case 8:
                    System.out.print("Enter Course ID: ");
                    courseId = scanner.nextInt();
                    Service.changeCourseStatus(courseId);
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
                    Service.viewEnrollments(studentId);
                    break;
                case 11:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    courseId = scanner.nextInt();
                    Service.changeEnrollmentStatus(studentId, courseId);
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
