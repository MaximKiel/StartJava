package com.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);
    private final Player[] players = new Player[3];

    private int targetNumber;

    public GuessNumber(Player[] players) {
        this.players[0] = players[0];
        this.players[1] = players[1];
        this.players[2] = players[2];
    }

    public void start() {
        targetNumber = (int) (Math.random() * 100) + 1;
        System.out.println("""
                Начинаем! Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!
                У каждого игрока есть по 10 попыток!""");

        for (Player player : players) {
            player.setCounter(0);
            player.numbersToZero();
        }

        outer:
        for (int i = 0; i < 10; i++) {
            for (Player player : players) {
                player.setCounter(i + 1);
                enterNumber(player, player.getCounter());
                if (checkNumber(player, player.getNumber(i), player.getCounter())) {
                    break outer;
                }
                if (player.getCounter() == 10) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                }
            }
        }

        for (Player player : players) {
            player.getNumbers();
        }
    }

    private void enterNumber(Player player, int counter) {
        System.out.print("Игрок " + player.getName() + " предлагает число: ");
        player.setNumbers(scanner.nextInt(), counter);
    }

    private boolean checkNumber(Player player, int number, int counter) {
        if (number == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber +
                    " c " + counter + " попытки");
            return true;
        }
        if (number != 0) {
            System.out.print("Число " + number + (number > targetNumber ? " больше" : " меньше")
                    + " того, что загадал компьютер\n");
            return false;
        }
        return false;
    }
}