package org.CS5800.Aggregation;

public class Textbook {
    private String title;
    private String author;
    private String publisher;
    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void printTextbook() {
        System.out.println("Textbook: " + title + " by " + author);
        System.out.println("Publisher: " + publisher);
    }
}
