package com.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);
    private final Player[] players;
    private int targetNumber;
    public GuessNumber(Player[] players) {
        this.players = Arrays.copyOf(players, players.length);
    }

    public void start() {
        Selection selection = new Selection(players);
        selection.draw(players);

        targetNumber = (int) (Math.random() * 100) + 1;
        System.out.println("""
                Начинаем! Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!
                У каждого игрока есть по 10 попыток!""");

        for (Player player : players) {
            player.clear();
        }

        boolean isLoopStop;
        int loopCounter = 0;
        do {
            isLoopStop = false;
            loopCounter++;
            for (Player player : players) {
                if (enterNumber(player)) {
                    if (checkNumber(player)) {
                        isLoopStop = true;
                        break;
                    }
                }
                if (player.getCountAttempts() == 10) System.out.println("У " + player.getName() + " закончились попытки");
            }
        } while (!isLoopStop && loopCounter < 10);

        if (loopCounter == 10) System.out.println("Игра завершена! У игроков закончились попытки!");

        for (Player player : players) {
            printNumbers(player);
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
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber +
                    " c " + player.getCountAttempts() + " попытки");
            return true;
        }
        System.out.println("Число " + player.getNumber() + (player.getNumber() > targetNumber ? " больше" : " меньше")
                + " того, что загадал компьютер");
            return false;
    }

    public void printNumbers(Player player) {
        int[] enteredNumbers = Arrays.copyOf(player.getNumbers(), player.getCountAttempts());
        System.out.print("Ответы игрока " + player.getName() + ": ");
        for (int num : enteredNumbers) {
            System.out.print(num == 0 ? "x " : num + " ");
        }
        System.out.println();
    }
}