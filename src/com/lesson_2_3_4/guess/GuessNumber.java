package com.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);
    private final Player[] players;
    private int targetNumber;

    public GuessNumber(Player[] players) {
        this.players = Arrays.copyOf(players, players.length);
    }

    public void start() {
        targetNumber = (int) (Math.random() * 100) + 1;
        System.out.println("""
                Начинаем! Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!
                У каждого игрока есть по 10 попыток!""");

        for (Player player : players) {
            player.clear();
        }

        boolean stopping;
        do {
            stopping = true;
            for (Player player : players) {
                enterNumber(player);
                if (checkNumber(player)) {
                    stopping = false;
                    break;
                }
                if (player.getCountAttempts() == 10) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                }
            }
        } while (stopping);

        for (Player player : players) {
            player.printNumbers();
        }
    }

    private void enterNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " предлагает число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() == 0) {
            return false;
        } else if (player.getNumber() == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber +
                    " c " + player.getCountAttempts() + " попытки");
            return true;
        } else {
            System.out.println("Число " + player.getNumber() + (player.getNumber() > targetNumber ? " больше" : " меньше")
                    + " того, что загадал компьютер");
            return false;
        }
    }
}