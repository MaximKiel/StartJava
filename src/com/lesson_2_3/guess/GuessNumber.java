package com.lesson_2_3.calculator;

import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.playerOne = player1;
        this.playerTwo = player2;
    }

    public void start() {
        targetNumber = (int) (Math.random() * 100) + 1;
        System.out.println("\nНачинаем! Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!");
        do {
            System.out.print("Игрок " + playerOne.getName() + " предлагает число: ");
            playerOne.setNumber(scanner.nextInt());
            if (checkNumber(playerOne)) {
                break;
            }
            System.out.print("Игрок " + playerTwo.getName() + " предлагает число: ");
            playerTwo.setNumber(scanner.nextInt());
            if (checkNumber(playerTwo)) {
                break;
            }
        } while (true);
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() <= 0 || player.getNumber() > 100) {
            System.out.println("Ошибка! Число должно быть в полуинтервале (0; 100]");
            return false;
        }
        if (player.getNumber() == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал!");
            return true;
        }
        if (player.getNumber() > targetNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
        return false;
    }
}