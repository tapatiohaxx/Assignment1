package org.CS5800.Aggregation;

public class Course {
    private String courseName;
    private Instructor[] instructors;
    private Textbook[] textbooks;
    public Course(String courseName, Instructor[] instructors, Textbook[] textbooks) {
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public Instructor[] getInstructors() { return instructors; }
    public void setInstructors(Instructor[] instructors) { this.instructors = instructors; }
    public Textbook[] getTextbooks() { return textbooks; }
    public void setTextbooks(Textbook[] textbooks) { this.textbooks = textbooks; }
    public void printCourseInfo() {
        System.out.println("Course Name: " + courseName);
        for (Instructor instructor : instructors)
            System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        for (Textbook textbook : textbooks)
            System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());

    }
}