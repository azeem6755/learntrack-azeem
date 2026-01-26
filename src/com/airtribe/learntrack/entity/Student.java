package com.airtribe.learntrack.entity;

public class Student {
    private final int id;
    private String firstName;
    private String lastName;
    private String email;
    private String batch;
    private boolean active;

    private static int counter=0;

    public Student(String firstName, String lastName, String email, String batch) {
        this.id = ++counter;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setBatch(batch);
        setStatus(true);
    }

    public Student(String firstName, String lastName, String batch) {
        this.id = ++counter;
        setFirstName(firstName);
        setLastName(lastName);
        setBatch(batch);
        setEmail("");
        setStatus(true);
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

    public String getEmail() {
        return this.email;
    }

    public String getBatch() {
        return this.batch;
    }

    public boolean getStatus() {
        return this.active;
    }

    public int getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setStatus(boolean status) {
        this.active = status;
    }

    public void displayStudent() {
        System.out.printf("ID: %d\n", this.id);
        System.out.printf("Name: %s\n", this.getName());
        System.out.printf("Email: %s\n", this.email);
        System.out.printf("Batch: %s\n", this.batch);
        System.out.printf("Active: %b\n\n", this.active);
    }
}
