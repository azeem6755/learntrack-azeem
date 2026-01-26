package com.airtribe.learntrack.entity;

public class Enrollment {
    private final int id;
    private int studentId;
    private int courseId;
    private String enrollmentDate;
    private String status;

    private static int counter = 0;

    public Enrollment() {
        this.id = ++counter;
    }
}
