package com.lesson_2_3_4.bookcase;

import java.util.Arrays;

public class Bookcase {

    private static final int SHELVES_QUANTITY = 10;
    private final Book[] books;
    private int countBooks;

    public Bookcase() {
        books = new Book[SHELVES_QUANTITY];
    }

    public void addBook(Book book) {
        if (countBooks < books.length) {
            if (book.getTitle() != null) {
                books[countBooks] = book;
                countBooks++;
            }
        } else System.out.println("На полке нет места!");
    }

    public boolean deleteBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                System.arraycopy(books, i + 1, books, i, countBooks - (i + 1));
                books[countBooks - 1] = null;
                countBooks--;
                return true;
            }
        }
        return false;
    }

    public Book findBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                return books[i];
            }
        }
        return null;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getFreePlace() {
        return books.length - countBooks;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        System.out.println("Полка очищена!");
    }
}
