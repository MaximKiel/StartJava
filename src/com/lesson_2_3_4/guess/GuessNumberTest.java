package com.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = createPlayers();

        GuessNumber game = new GuessNumber(players);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
        } while (!answer.equals("no"));

        System.out.println("Конец игры! До свидания!");
    }

    private static Player[] createPlayers() {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(scanner.next());
        }
        return players;
    }
}