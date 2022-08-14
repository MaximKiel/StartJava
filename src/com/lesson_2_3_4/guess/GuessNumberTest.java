package com.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[3];
        makePlayer(players);

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

    private static void makePlayer(Player[] players) {
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(scanner.next());
        }
    }
}