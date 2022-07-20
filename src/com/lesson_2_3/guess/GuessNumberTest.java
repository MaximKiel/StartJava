package com.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя 1 игрока: ");
        Player playerOne = new Player(scanner.next());

        System.out.print("Введите имя 2 игрока: ");
        Player playerTwo = new Player(scanner.next());

        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        String answer;

        do {
            game.start();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

        System.out.println("Конец игры! До свидания!");
    }
}