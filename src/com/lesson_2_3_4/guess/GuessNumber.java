package com.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);
    private final Player playerOne;
    private final Player playerTwo;
    private final Player playerThree;
    private int targetNumber;

    public GuessNumber(Player[] players) {
        this.playerOne = players[0];
        this.playerTwo = players[1];
        this.playerThree = players[2];
    }

    public void start() {
        targetNumber = (int) (Math.random() * 100) + 1;
        System.out.println("""
                
                Начинаем! Компьютер загадал число от 0 до 100! Теперь попробуйте угадать его!
                У каждого игрока есть по 10 попыток!""");
        int playerOneCounter = 0;
        int playerTwoCounter = 0;
        int playerThreeCounter = 0;
        playerArrayToZero(playerOne);
        playerArrayToZero(playerTwo);
        playerArrayToZero(playerThree);

        do {
            playerOneCounter++;
            if (checkNumber(playerOne, playerOneCounter)) {
                break;
            }
            if (playerOneCounter == 10) {
                System.out.println("У " + playerOne.getName() + " закончились попытки");
            }
            playerTwoCounter++;
            if (checkNumber(playerTwo, playerTwoCounter)) {
                break;
            }
            if (playerTwoCounter == 10) {
                System.out.println("У " + playerTwo.getName() + " закончились попытки");
            }
            playerThreeCounter++;
            if (checkNumber(playerThree, playerThreeCounter)) {
                break;
            }
            if (playerThreeCounter == 10) {
                System.out.println("У " + playerThree.getName() + " закончились попытки");
            }
        } while (playerTwoCounter < 10);

        playerAnswers(playerOne, playerOneCounter);
        playerAnswers(playerTwo, playerTwoCounter);
        playerAnswers(playerThree, playerThreeCounter);
    }

    private boolean checkNumber(Player player, int counter) {
        System.out.print("Игрок " + player.getName() + " предлагает число: ");
        player.setNumberArray(scanner.nextInt(), counter);

        if (player.getNumber() <= 0 || player.getNumber() > 100) {
            System.out.println("Ошибка! Число должно быть в полуинтервале (0; 100]");
            return false;
        }
        if (player.getNumber() == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber +
                    " c " + (counter) + " попытки");
            return true;
        }
        System.out.print("Число " + player.getNumber());
        System.out.print(player.getNumber() > targetNumber ? " больше" : " меньше");
        System.out.print(" того, что загадал компьютер");
        System.out.println();
        return false;
    }

    private void playerAnswers (Player player, int index) {
        int[] numbers = Arrays.copyOf(player.getNumberArray(), index);
        System.out.print("Ответы игрока " + player.getName() + ": ");
        for (int number : numbers) {
            if (number == 0) System.out.print("x ");
                else System.out.print(number + " ");
        }
        System.out.println();
    }

    private void playerArrayToZero (Player player) {
        Arrays.fill(player.getNumberArray(), 0);
    }
}