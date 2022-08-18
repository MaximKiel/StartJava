package com.lesson_2_3_4.guess;

import java.util.*;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);
    private final Player[] players;
    private int targetNumber;
    private static final int ATTEMPTS_NUMBER = 10;
    private static final int ROUNDS_NUMBER = 3;

    public GuessNumber(Player[] players) {
        this.players = Arrays.copyOf(players, players.length);
    }

    public void start() {
        castLots();

        for (Player player : players) {
            player.clearWin();
        }

        System.out.println("\nНачинаем игру!");

        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.println("\nРаунд " + (i + 1));

            targetNumber = (int) (Math.random() * 100) + 1;
            System.out.println("""
                    Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!
                    У каждого игрока есть по 10 попыток!""");

            for (Player player : players) {
                player.clear();
            }

            boolean guessed;
            do {
                guessed = false;
                for (Player player : players) {
                    if (enterNumber(player)) {
                        if (checkNumber(player)) {
                            System.out.println("В " + (i + 1) + " раунде победил " + player.getName());
                            player.setWinCounter();
                            guessed = true;
                            break;
                        }
                    }
                    if (player.getCountAttempts() == ATTEMPTS_NUMBER) {
                        System.out.println("У " + player.getName() + " закончились попытки");
                    }
                }
            } while (!guessed && players[players.length - 1].getCountAttempts() < ATTEMPTS_NUMBER);

            if (players[players.length - 1].getCountAttempts() == ATTEMPTS_NUMBER) {
                System.out.println("Раунд завершен! У игроков закончились попытки!");
            }

            System.out.println();

            for (Player player : players) {
                printNumbers(player);
            }
        }
        determineWinner();
    }

    private void castLots() {
        Random random = new Random();

        for (int i = players.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Player tmp = players[index];
            players[index] = players[i];
            players[i] = tmp;
        }

        System.out.println("\nРезультаты жеребьевки:");

        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + " ходит игрок " + players[i].getName());
        }
    }

    private boolean enterNumber(Player player) {
        try {
            System.out.print("Игрок " + player.getName() + " предлагает число: ");
            player.setNumber(scanner.nextInt());
            return true;
        } catch (InputMismatchException e) {
            System.out.println("Некорректное выражение!");
            player.setNumber(0);
            scanner.next();
            return false;
        }
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber
                    + " c " + player.getCountAttempts() + " попытки");
            return true;
        }

        System.out.println("Число " + player.getNumber() + (player.getNumber() > targetNumber
                ? " больше" : " меньше") + " того, что загадал компьютер");
        return false;
    }

    private void printNumbers(Player player) {
        System.out.print("Ответы игрока " + player.getName() + ": ");
        for (int num : player.getNumbers()) {
            System.out.print(num == 0 ? "x " : num + " ");
        }
        System.out.println();
    }

    private void determineWinner() {
        Player winner = null;

        for (Player player1 : players) {
            if (player1.getWinCounter() >= (ROUNDS_NUMBER - 1)) {
                winner = player1;
                break;
            }
            for (Player player2 : players) {
                if (player1.getWinCounter() == player2.getWinCounter()) {
                    break;
                }
                if (player1.getWinCounter() > player2.getWinCounter()) {
                    winner = player1;
                    break;
                }
            }
        }

        if (winner != null) {
            System.out.println("\nИгрок " + winner.getName() + " победил!");
            return;
        }

        System.out.print("\nНичья! Победители раундов: ");
        for (Player player : players) {
            if (player.getWinCounter() != 0) {
                System.out.print(player.getName() + " ");
            }
        }
        System.out.println();
    }
}