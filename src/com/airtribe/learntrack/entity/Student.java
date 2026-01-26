package com.airtribe.learntrack.entity;

public class Student extends Person{
    private final int id;
    private String batch;
    private boolean active;

    private static int counter=0;

    public Student(String firstName, String lastName, String email, String batch) {
        super(firstName, lastName, email);
        this.id = ++counter;
        setBatch(batch);
        setStatus(true);
    }

    public Student(String firstName, String lastName, String batch) {
        super(firstName, lastName);
        this.id = ++counter;
        setBatch(batch);
        setStatus(true);
    }

    public String getEmail() {
        return super.email;
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

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setStatus(boolean status) {
        this.active = status;
    }

    public void display() {
        System.out.println("CHILD");
        System.out.printf("ID: %d\n", this.id);
        super.display();
        System.out.printf("Batch: %s\n", this.batch);
        System.out.printf("Active: %b\n\n", this.active);
    }
}
