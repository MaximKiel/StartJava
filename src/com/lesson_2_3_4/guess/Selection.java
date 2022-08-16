package com.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;

public class Selection {

    private final Player[] players;

    public Selection(Player[] players) {
        this.players = Arrays.copyOf(players, players.length);
    }

    public void draw(Player[] players) {
        int[] playersIndex = new int[players.length];

        for (int i = 0; i < players.length; i++) {
            playersIndex[i] = i + 1;
        }

        int[] round1 = Arrays.copyOf(playersIndex, playersIndex.length);
        int[] round2 = Arrays.copyOf(playersIndex, playersIndex.length);
        int[] round3 = Arrays.copyOf(playersIndex, playersIndex.length);
        int[] playersIndexDraw = new int[players.length];

        do {
            Arrays.fill(playersIndexDraw, 0);
            solution(round1);
            solution(round2);
            solution(round3);

            for (int i = 0; i < players.length; i++) {
                for (int j = 0; j < players.length; j++) {
                    int counter = 0;
                    if (playersIndex[j] == round1[i]) {
                        counter++;
                    }
                    if (playersIndex[j] == round2[i]) {
                        counter++;
                    }
                    if (playersIndex[j] == round3[i]) {
                        counter++;
                    }
                    if (counter >= 2) {
                        System.arraycopy(playersIndex, j, playersIndexDraw, i, 1);
                        break;
                    }
                }
            }

            if (playersIndexDraw[0] == 0 || playersIndexDraw[1] == 0 || playersIndexDraw[2] == 0) {
                System.out.println("Ничья! Результаты жеребьевки за три раунда: ");
                printArray(round1);
                printArray(round2);
                printArray(round3);
                System.out.println("Повторная жеребьевка...");
            } else {
                System.out.print("Результаты жеребьевки:\n");
                for (int i = 0; i < players.length; i++) {
                    System.out.println((i + 1) + " ходит игрок " + players[playersIndexDraw[i] - 1].getName());
                }
                break;
            }
        } while (true);

        Player[] tmpArr = Arrays.copyOf(players, players.length);

        for (int i = 0; i < 3; i++) {
            if (playersIndexDraw[i] == 1) {
                players[i] = tmpArr[0];
            } else if (playersIndexDraw[i] == 2) {
                players[i] = tmpArr[1];
            } else if (playersIndexDraw[i] == 3) {
                players[i] = tmpArr[2];
            }
        }
    }

    private void solution(int[] array) {
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
                System.out.print(players[0].getName() + " ");
            } else if (array[i] == 2) {
                System.out.print(players[1].getName() + " ");
            } else if (array[i] == 3) {
                System.out.print(players[2].getName() + " ");
            }
        }
        System.out.println();
    }
}
