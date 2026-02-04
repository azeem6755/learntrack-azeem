package com.airtribe.learntrack.entity;
import java.time.LocalDate;

import com.airtribe.learntrack.util.EnrollmentStatus;
import com.airtribe.learntrack.util.IdGenerator;

public class Enrollment {
    private final int id;
    private int studentId;
    private int courseId;
    private final LocalDate enrollmentDate;
    private EnrollmentStatus status;

    public Enrollment(int studentId, int courseId) {
        this.id = IdGenerator.getNextEnrollmentId();
        setStudentId(studentId);
        setCourseId(courseId);
        setEnrollmentStatus(EnrollmentStatus.ACTIVE);
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

    public void setEnrollmentStatus(EnrollmentStatus status) {
        this.status = status;
    }

    public void display() {
        System.out.printf("ID: %d\n", this.getId());
        System.out.println("Enrollment Date: " + this.getEnrollmentDate());
        System.out.printf("Status: %s\n\n", this.getStatus());
    }
    
}
