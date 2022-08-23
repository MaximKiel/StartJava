package com.lesson_2_3_4.bookcase;

import java.util.Scanner;

public class BookcaseTest {

    static final int BOOKCASE_VALUE = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        Book[] books = new Book[BOOKCASE_VALUE];

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) books[i] = new Book();
        }

        Bookcase bookcase = new Bookcase(books);

        do {
            printBookcase(bookcase.getBookcase());
            printMenu();
            answer = sc.nextLine();
            switch (answer) {
                case "1" -> {
                    System.out.println("Введите данные книги через слэш: ");
                    bookcase.addBook(sc.nextLine());
                }
                case "2" -> {
                    System.out.println("Введите название книги, которую нужно удалить: ");
                    bookcase.deleteBook(sc.nextLine());
                }
                case "3" -> {
                    System.out.println("Введите название книги, которую нужно найти: ");
                    printBookInfo(bookcase.findBook(sc.nextLine()));
                }
                case "4" -> System.out.println("Число книг на полке: " + bookcase.getBookCounter());
                case "5" -> System.out.println("Число свободных мест: " + bookcase.getFreePlace(BOOKCASE_VALUE));
                case "6" -> printBookcase(bookcase.getBookcase());
                case "7" -> bookcase.clear();
                case "8" -> System.exit(0);
            }
        } while (true);
    }

    private static void printMenu() {
        System.out.print("""
                
                Меню пользователя:
                1. Сохранить новую книгу <Фамилия Имя / Название / Год публикации>
                2. Удалить книгу <Название>
                3. Найти книгу <Название>
                4. Получить количество всех книг на полке
                5. Получить количество свободных мест на полке
                6. Получить все книги
                7. Очистить книжную полку
                8. Завершить
                
                Введите номер действия из меню:
                """);
    }

    private static void printBookInfo(Book book) {
        System.out.printf("%-60s", "|" + book.toString());
        System.out.println("|");
        for (int i = 0; i <= 60; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private static void printBookcase(Book[] books) {
        for (Book book : books) {
            printBookInfo(book);
        }
        for (int i = 0; i < BOOKCASE_VALUE - books.length; i++) {
            System.out.printf("%-60s", "| ");
            System.out.println("|");
            for (int j = 0; j <= 60; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
