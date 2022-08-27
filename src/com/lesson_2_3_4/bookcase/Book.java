package com.lesson_2_3_4.bookcase;

public class Book {

    private int length;
    private String author;
    private String title;
    private int publicationYear;

    public boolean setInfo(String info) {
        this.length = info.length();
        String[] infoArray = info.split(" / ");
        if (infoArray.length == 3) {
            this.author = infoArray[0];
            this.title = infoArray[1];
            this.publicationYear = Integer.parseInt(infoArray[2]);
            return true;
        } else return false;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }

    public int getLength() {
        return length;
    }
}
