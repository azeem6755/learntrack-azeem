package com.airtribe.learntrack.entity;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String email;

    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(null);
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("Parent class");
        System.out.printf("Name: %s\n", this.getName());
        System.out.printf("Email: %s\n", this.email);
    }
}
