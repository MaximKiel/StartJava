package com.lesson_2_3_4.bookcase;

import java.util.Arrays;

public class Bookcase {

    static final int SHELVES_QUANTITY = 10;
    private final Book[] books;
    private int bookCounter;

    public Bookcase() {
        this.books = new Book[SHELVES_QUANTITY];
    }

    public void addBook(Book book, String info) {
        if (bookCounter < books.length) {
            if (book.setInfo(info)) {
                books[bookCounter] = book;
                bookCounter++;
            } else System.out.println("Некорректные данные!");
        } else System.out.println("На полке нет места!");
    }

    public boolean deleteBook(String title) {
        for (int i = 0; i < bookCounter; i++) {
            if (title.equals(books[i].getTitle())) {
                System.arraycopy(books, i + 1, books, i, bookCounter - (i + 1));
                books[bookCounter - 1] = null;
                bookCounter--;
                return true;
            }
        }
        return false;
    }

    public Book findBook(String title) {
        for (int i = 0; i < bookCounter; i++) {
            if (title.equals(books[i].getTitle())) {
                System.out.println("Книга, которую вы искали: ");
                return books[i];
            }
        }
        return null;
    }

    public int getBookCounter() {
        return bookCounter;
    }

    public int getFreePlace() {
        return books.length - bookCounter;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public void clear() {
        Arrays.fill(books,null);
        bookCounter = 0;
        System.out.println("Полка очищена!");
    }
}
