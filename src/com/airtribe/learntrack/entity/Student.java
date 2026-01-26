package com.airtribe.learntrack.entity;

public class Student {
    private final int id;
    private String firstName;
    private String lastName;
    private String email;
    private String batch;
    private boolean active;

    private static int counter=0;

    public Student() {
        this.id = ++counter;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
