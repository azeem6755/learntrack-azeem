package com.airtribe.learntrack.entity;
import com.airtribe.learntrack.exception.InvalidInputException;
import com.airtribe.learntrack.util.IdGenerator;

public class Student extends Person{
    private final int id;
    private String batch;
    private boolean active;


    public Student(String firstName, String lastName, String email, String batch) throws InvalidInputException {
        super(firstName, lastName, email);
        this.id = IdGenerator.getNextStudentId();
        setBatch(batch);
        setStatus(true);
    }

    public Student(String firstName, String lastName, String batch) throws InvalidInputException {
        super(firstName, lastName);
        this.id = IdGenerator.getNextStudentId();
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

    @Override
    public void display() {
        System.out.printf("ID: %d\n", this.id);
        super.display();
        System.out.printf("Batch: %s\n", this.batch);
        System.out.printf("Active: %b\n\n", this.active);
    }

    public void displayID() {
        System.out.printf("ID: %d; Name: %s\n", this.id, super.getName());
    }
}
