package com.lesson_2_3_4.bookcase;

public class Book {

    private final int length;
    private String author;
    private String title;
    private int publicationYear;

    public Book(String info) {
        length = info.length();
        String[] infoArray = info.split(" / ");
        if (infoArray.length == 3) {
            author = infoArray[0];
            title = infoArray[1];
            publicationYear = Integer.parseInt(infoArray[2]);
        } else System.out.println("Некорректные данные!");
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }
}
