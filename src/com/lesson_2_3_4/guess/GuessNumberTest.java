package com.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя 1 игрока: ");
        Player playerOne = new Player(scanner.next());

        System.out.print("Введите имя 2 игрока: ");
        Player playerTwo = new Player(scanner.next());

        System.out.print("Введите имя 3 игрока: ");
        Player playerTree = new Player(scanner.next());

        Player[] players = {playerOne, playerTwo, playerTree};

        Selection selection = new Selection(players);
        GuessNumber game = new GuessNumber(players);
        String answer;

        do {
            selection.draw(players);
            game.start();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

        System.out.println("Конец игры! До свидания!");
    }
}