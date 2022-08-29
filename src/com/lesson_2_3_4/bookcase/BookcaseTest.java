package com.lesson_2_3_4.bookcase;

import java.util.Scanner;

public class BookcaseTest {

    private static int shelfWidth = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        Bookcase bookcase = new Bookcase();

        do {
            try {
                printBookcase(bookcase.getBooks());
                printMenu();
                String menuItem = sc.nextLine();
                switch (menuItem) {
                    case "1" -> {
                        System.out.print("Введите данные книги через слэш: ");
                        Book book = new Book(sc.nextLine());
                        bookcase.addBook(book);
                    }
                    case "2" -> {
                        System.out.print("Введите название книги, которую нужно удалить: ");
                        if (bookcase.deleteBook(sc.nextLine())) System.out.println("Книга удалена!");
                        else System.out.println("Такой книги нет на полке!");
                    }
                    case "3" -> {
                        System.out.print("Введите название книги, которую нужно найти: ");
                        printBookInfo(bookcase.findBook(sc.nextLine()));
                    }
                    case "4" -> System.out.println("Число книг на полке: " + bookcase.getCountBooks());
                    case "5" -> System.out.println("Число свободных мест на полке: "
                            + bookcase.getFreePlace());
                    case "6" -> bookcase.clear();
                    case "7" -> {
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода!");
            }
        } while (true);
    }

    private static void printBookcase(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                int length = book.getLength();
                if (length >= shelfWidth) shelfWidth = length;
                System.out.print("|" + book);
                System.out.println(" ".repeat(shelfWidth - length) + "|");
                System.out.println("-".repeat(shelfWidth));
            } else {
                System.out.println("|" + " ".repeat(shelfWidth - 2) + "|");
                System.out.println("-".repeat(shelfWidth));
            }
        }
    }

    private static void printMenu() {
        System.out.print("""
                
                Меню пользователя:
                1. Сохранить новую книгу <Фамилия Имя / Название / Год публикации>
                2. Удалить книгу <Название>
                3. Найти книгу <Название>
                4. Получить количество всех книг на полке
                5. Получить количество свободных мест на полке
                6. Очистить книжную полку
                7. Завершить
                
                Введите номер действия из меню:\040""");
    }

    private static void printBookInfo(Book book) {
        if (book != null) {
            System.out.println("Книга, которую вы искали: ");
            System.out.println("|" + book + "|");
            System.out.println("-".repeat(book.getLength()));
        } else {
            System.out.println("Такой книги нет на полке!");
        }
    }
}
