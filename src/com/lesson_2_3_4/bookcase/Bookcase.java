package com.lesson_2_3_4.bookcase;

public class Bookcase {

    private final Book[] books;

    private int bookCounter;

    public Bookcase(int length) {
        this.books = new Book[length];
    }

    public void addBook(String info) {
        if (bookCounter < 10 ) {
            books[bookCounter] = new Book();
            String[] infoArray = info.split(" / ");
            books[bookCounter].setAuthor(infoArray[0]);
            books[bookCounter].setTitle(infoArray[1]);
            books[bookCounter].setPublicationYear(Integer.parseInt(infoArray[2]));
            bookCounter++;
        } else System.out.println("На полке нет места!");
    }

    public boolean deleteBook(String title) {
        for (int i = 0; i < bookCounter; i++) {
            if (title.equals(books[i].getTitle())) {
                System.arraycopy(books, i + 1, books, i, bookCounter - (i + 1));
                bookCounter--;
                return true;
            }
        }
        return false;
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (title.equals(book.getTitle())) {
                System.out.println("Книга, которую вы искали: ");
                return book;
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
        Book[] booksNotNull = new Book[bookCounter];
        System.arraycopy(books, 0, booksNotNull, 0, bookCounter);
        return booksNotNull;
    }

    public void clear() {
        for (int i = 0; i < bookCounter; i++) {
            books[i] = null;
        }
        bookCounter = 0;
        System.out.println("Полка очищена!");
    }
}
