package com.lesson_2_3_4.bookcase;

import java.util.Scanner;

public class BookcaseTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int bookcaseValue = 10;
        String answer;

        Book[] books = new Book[bookcaseValue];
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) books[i] = new Book();
        }

        Bookcase bookcase = new Bookcase(books);

        do {
            printMenu();

            answer = sc.nextLine();
            switch (answer) {
                case "1" -> {
                    System.out.println("Введите данные книги через точку с запятой: ");
                    bookcase.addBook(sc.nextLine());
                }
                case "2" -> {
                    System.out.println("Введите название книги, которую нужно удалить: ");
                    bookcase.deleteBook(sc.nextLine());
                }
                case "3" -> {
                    System.out.println("Введите название книги, которую нужно найти: ");
                    printInfo(bookcase.findBook(sc.nextLine()));

                }
                case "4" -> System.out.println("Число книг на полке: " + bookcase.getBookCounter());
                case "5" -> System.out.println("Число свободных мест на полке: " + bookcase.getFreePlace(books.length));
                case "6" -> {
                    Book[] books1 = bookcase.getBookcase();
                    for (int i = 0; i < books1.length; i++) {
                        printInfo(books1[i]);
                    }
                }
                case "7" -> bookcase.clear();
                case "8" -> System.exit(0);
            }
            bookcase.getBookcase();
        } while (true);
    }

    private static void printMenu() {
        System.out.print("""
                
                Меню пользователя:
                1. Сохранить новую книгу <Фамилия Имя> <Название> <Год публикации>
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

    private static void printInfo(Book book) {
        System.out.printf("%-60s", "|" + book.toString());
        System.out.println("|");
        for (int i = 0; i <= 60; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
