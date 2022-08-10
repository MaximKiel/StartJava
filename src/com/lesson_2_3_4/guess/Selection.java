package com.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;

public class Selection {
    private final Player playerOne;
    private final Player playerTwo;
    private final Player playerThree;

    public Selection(Player[] players) {
        this.playerOne = players[0];
        this.playerTwo = players[1];
        this.playerThree = players[2];
    }

    public void draw(Player[] players) {
        int[] playersArray = {1, 2, 3};
        int[] round1 = Arrays.copyOf(playersArray, playersArray.length);
        int[] round2 = Arrays.copyOf(playersArray, playersArray.length);
        int[] round3 = Arrays.copyOf(playersArray, playersArray.length);
        int[] playersArrayFinal = new int[playersArray.length];

        do {
            solution (round1);
            solution (round2);
            solution (round3);

            int index1 = 0;
            int index2 = 0;

            do {
                do {
                    int counter = 0;
                    if (playersArray[index1] == round1[index2]) {
                        counter++;
                    }
                    if (playersArray[index1] == round2[index2]) {
                        counter++;
                    }
                    if (playersArray[index1] == round3[index2]) {
                        counter++;
                    }
                    if (counter >= 2) {
                        playersArrayFinal[index2] = playersArray[index1];
                        break;
                    }
                    index1++;
                } while (index1 < 3);
                index1 = 0;
                index2++;
            } while (index2 < 3);

            if (playersArrayFinal[0] == 0 || playersArrayFinal[1] == 0 || playersArrayFinal[2] == 0) {
                System.out.println("Ничья! Результаты жеребьевки за три раунда: ");
                printArray(round1);
                printArray(round2);
                printArray(round3);
                System.out.println("Повторная жеребьевка...");
            } else {
                System.out.println("Результаты жеребьевки: " + "\nПервым ходит игрок " + playerOne.getName()
                        + "\nВторым ходит игрок " + playerTwo.getName()
                        + "\nТретьим ходит игрок " + playerThree.getName());
                break;
            }
        } while (true);

        for (int i = 0; i < 3; i++) {
            if (playersArrayFinal[i] == 1) {
                players[i] = playerOne;
            } else if (playersArrayFinal[i] == 2) {
                players[i] = playerTwo;
            } else if (playersArrayFinal[i] == 3) {
                players[i] = playerThree;
            }
        }
    }

    private void solution (int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    private void printArray(int[] array) {
        for (int i = 0; i < 3; i++) {
            if (array[i] == 1) {
                System.out.print(playerOne.getName() + " ");
            } else if (array[i] == 2) {
                System.out.print(playerTwo.getName() + " ");
            } else if (array[i] == 3) {
                System.out.print(playerThree.getName() + " ");
            }
        }
        System.out.println();
    }
}
