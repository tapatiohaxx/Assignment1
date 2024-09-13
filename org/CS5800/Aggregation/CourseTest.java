package org.CS5800.Aggregation;

public class CourseTest {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("John", "Doe", "2-1234");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");
        Instructor[] instructors = { instructor1, instructor2 };
        Textbook[] textbooks = { textbook1, textbook2 };
        Course course = new Course("Software Engineering", instructors, textbooks);
        course.printCourseInfo();
    }
}
