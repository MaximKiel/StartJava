package com.lesson_2_3_4.bookcase;

import java.util.Scanner;

public class BookcaseTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");

        Bookcase bookcase = new Bookcase();

        do {
            try {
                printBookcase(bookcase.getBooks(), bookcase.getBookCounter());
                printMenu();
                String menuItem = sc.nextLine();
                switch (menuItem) {
                    case "1" -> {
                        System.out.print("Введите данные книги через слэш: ");
                        Book book = new Book();
                        bookcase.addBook(book, sc.nextLine());
                    }
                    case "2" -> {
                        System.out.print("Введите название книги, которую нужно удалить: ");
                        if (bookcase.deleteBook(sc.nextLine())) System.out.println("Книга удалена!");
                        else System.out.println("Такой книги нет на полке!");
                    }
                    case "3" -> {
                        System.out.print("Введите название книги, которую нужно найти: ");
                        printBookInfo(bookcase.findBook(sc.nextLine()));
                        System.out.println();
                    }
                    case "4" -> System.out.println("Число книг на полке: " + bookcase.getBookCounter());
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

    private static void printBookcase(Book[] books, int bookCounter) {
        int shelfWidth = 2;

        for (int i = 0; i < bookCounter; i++) {
            for (int j = 0; j < bookCounter; j++) {
                if (books[i].getLength() > shelfWidth) {
                    shelfWidth = books[i].getLength();
                }
                if (books[i].getLength() > books[j].getLength() && books[i].getLength() > shelfWidth) {
                    shelfWidth = books[i].getLength();
                }
            }
        }

        for (Book book : books) {
            if (book != null) {
                System.out.print("|" + book);
                System.out.println(" ".repeat(shelfWidth - book.getLength()) + "|");
                System.out.println("-".repeat(shelfWidth));
            }
        }
        
        for (int i = 0; i < books.length - bookCounter; i++) {
            System.out.println("|" + " ".repeat(shelfWidth - 2) + "|");
            System.out.println("-".repeat(shelfWidth));
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
            System.out.println("|" + book + "|");
            System.out.println("-".repeat(book.getLength()));
        } else {
            System.out.println("Такой книги нет на полке!");
        }
    }
}
