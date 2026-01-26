package com.airtribe.learntrack.entity;
import java.time.LocalDate;

import com.airtribe.learntrack.util.EnrollmentStatus;

public class Enrollment {
    private final int id;
    private int studentId;
    private int courseId;
    private LocalDate enrollmentDate;
    private EnrollmentStatus status;

    private static int counter = 0;

    public Enrollment(int studentId, int courseId) {
        this.id = ++counter;
        setStudentId(studentId);
        setCourseId(courseId);
        this.status = EnrollmentStatus.ACTIVE;
        this.enrollmentDate = LocalDate.now();
        
    }

    public int getId() {
        return this.id;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getcourseId() {
        return this.courseId;
    }

    public LocalDate getEnrollmentDate() {
        return this.enrollmentDate;
    }

    public String getStatus() {
        return this.status.name();
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void display() {
        System.out.printf("ID: %d\n", this.id);
        System.out.printf("Student ID: %d\n", this.studentId);
        System.out.printf("Course ID: %d\n", courseId);
        System.out.println("Enrollment Date: " + this.enrollmentDate);
        System.out.printf("Status: %s\n\n", this.status.name());
    }
    
}
