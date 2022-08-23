package com.lesson_2_3_4.bookcase;

import java.util.Arrays;

public class Bookcase {

    private int bookCounter;

    private final Book[] books;

    public Bookcase(Book[] books) {
        this.books = Arrays.copyOf(books, books.length);
    }

    public void addBook(String info) {
        String[] infoArray = info.split("; ");
        books[bookCounter].setAuthor(infoArray[0]);
        books[bookCounter].setTitle(infoArray[1]);
        books[bookCounter].setPublicationYear(Integer.parseInt(infoArray[2]));
        bookCounter++;
    }

    public void deleteBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (title.equals(books[i].getTitle())) {
                System.arraycopy(books, i + 1, books, i, books.length - (i + 1));
                bookCounter--;
            }
        }
        System.out.println("Книга удалена!");
    }

    public Book findBook(String title) {
        System.out.println("Книга, которую вы искали: ");
        for (Book book : books) {
            if (title.equals(book.getTitle())) {
                return book;
            }
        }
        return null;
    }

    public int getBookCounter() {
        return bookCounter;
    }

    public int getFreePlace(int length) {
        return length - bookCounter;
    }

    public Book[] getBookcase() {
        Book[] booksNotNull = new Book[bookCounter];
        System.arraycopy(books, 0, booksNotNull, 0, bookCounter);
        return booksNotNull;
    }

    public void clear() {
        bookCounter = 0;
    }
}
