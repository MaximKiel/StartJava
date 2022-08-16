package com.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = createPlayers();
        String answer;

        do {
            Selection selection = new Selection(players);
            selection.draw(players);
            GuessNumber game = new GuessNumber(players);
            game.start();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

        System.out.println("Конец игры! До свидания!");
    }

    private static Player[] createPlayers() {
        Player[] players = new Player[3];
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(scanner.next());
        }
        return players;
    }
}