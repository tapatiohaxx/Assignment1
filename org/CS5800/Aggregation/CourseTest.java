package org.CS5800.Aggregation;

public class CourseTest {
    public static void main(String[] args) {
        Instructor profNima = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor profDenizen = new Instructor("Mark", "Denizen", "8-248");
        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook essentialsSWE = new Textbook("Essentials of Software Engineering", "Orlando Karam", "J&B Learning");
        Instructor[] csProfs = { profNima, profDenizen };
        Textbook[] csTextbooks = { cleanCode, essentialsSWE };
        Instructor profSmith = new Instructor("Antonio", "Smith", "6-145");
        Instructor profJohnson = new Instructor("Emily", "Johnson", "6-243");
        Textbook phonetics = new Textbook("Phonetics", "Peter Ladefoged", "Cambridge University Press");
        Textbook syntax = new Textbook("Syntax", "Andrew Carnie", "Wiley-Blackwell");
        Instructor[] lingProfs = { profSmith, profJohnson };
        Textbook[] lingTextbooks = { phonetics, syntax };
        Instructor profBrown = new Instructor("Derek", "Brown", "24-242");
        Instructor profGreen = new Instructor("David", "Green", "24-128");
        Textbook bouzoukiBible = new Textbook("Bouzouki Bible", "Christ M. Kacoyannakis", "Music Press");
        Textbook advancedBouzouki = new Textbook("Advanced Bouzouki Techniques", "Alexios Kosmonopulos", "Aiora Press");
        Instructor[] bouzoukiProfs = { profBrown, profGreen };
        Textbook[] bouzoukiTextbooks = { bouzoukiBible, advancedBouzouki };
        Instructor profWhite = new Instructor("Michael", "White", "24-133");
        Instructor profBlack = new Instructor("Soriah", "Black", "24-108");
        Textbook violinBasics = new Textbook("Violin for Beginners", "Emily Davis", "String Press");
        Textbook advancedViolin = new Textbook("Mastering the Violin", "Robert Brown", "String World");
        Instructor[] violinProfs = { profWhite, profBlack };
        Textbook[] violinTextbooks = { violinBasics, advancedViolin };

        Course csClasses = new Course("Software Engineering", csProfs, csTextbooks);
        Course lingClasses = new Course("Linguistics", lingProfs, lingTextbooks);
        Course bouzoukiClasses = new Course("Bouzouki Music", bouzoukiProfs, bouzoukiTextbooks);
        Course violinClasses = new Course("Violin Lessons", violinProfs, violinTextbooks);
        csClasses.printCourseInfo();
        lingClasses.printCourseInfo();
        bouzoukiClasses.printCourseInfo();
        violinClasses.printCourseInfo();
    }
}
