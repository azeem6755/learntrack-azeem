package com.airtribe.learntrack.ui;

import com.airtribe.learntrack.entity.*;;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Java", "This is a java course", 8);
        Student s1 = new Student("Azeem", "Shaikh", "azeem6755@gmail.com", "C-18");
        Enrollment e1 = new Enrollment(s1.getId(), c1.getId());

        Student s2 = new Student("Mariya", "Shaikh", "mariya@gmail.com", "C-18");
        Enrollment e2 = new Enrollment(s2.getId(), c1.getId());
        c1.display();
        s1.display();
        e1.display();
        s2.display();
        e2.display();
    }
}
