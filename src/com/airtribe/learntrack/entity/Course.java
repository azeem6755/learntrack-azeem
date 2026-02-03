package com.airtribe.learntrack.entity;
import com.airtribe.learntrack.util.IdGenerator;

public class Course {
    private final int id;
    private String courseName;
    private String description;
    private int durationInWeeks;
    private boolean active=false;

    public Course(String courseName, String description, int durationInWeeks) {
        this.id = IdGenerator.getNextCourseId();
        setCourseName(courseName);
        setDescription(description);
        setDuration(durationInWeeks);
        setActiveStatus(true);
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDuration() {
        return this.durationInWeeks;
    }

    public int getId() {
        return this.id;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(int duration) {
        this.durationInWeeks = duration;
    }

    public void setActiveStatus(boolean status) {
        this.active = status;
    }

    public void display() {
        System.out.printf("ID: %d\n", this.getId());
        System.out.printf("Name: %s\n", this.getCourseName());
        System.out.printf("Description: %s\n", this.getDescription());
        System.out.printf("Duration in weeks: %d\n", this.getDuration());
        System.out.printf("Status: %b\n\n", this.getActive());
    }

    public void displayId() {
        System.out.printf("ID: %d; Name: %s", this.getId(), this.getCourseName());
    }

}
