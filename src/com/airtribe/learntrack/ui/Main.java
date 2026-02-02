package com.airtribe.learntrack.ui;

import com.airtribe.learntrack.entity.*;
import com.airtribe.learntrack.service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exitFlag = false;
        Scanner scanner = new Scanner(System.in);

        while(!exitFlag) {
            System.out.println("Welcome!\n 1. Add Student 2. Add Course 3. List Students" +
                    " 4. List Courses 5. Create Enrollment 6. Remove Student 7. Remove Course 8. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Service.addStudent();
                    break;
                case 2:
                    Service.addCourse();
                    break;
                case 3:
                    Service.listStudents();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    Service.removeStudent();
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Bye!!!");
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Wrong choice! Please enter correct option");
            }
        }
    }
}
