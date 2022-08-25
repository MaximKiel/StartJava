package com.lesson_2_3_4.bookcase;

public class Book {

    private String author;
    private String title;
    private int publicationYear;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }
}
