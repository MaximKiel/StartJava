package com.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private int countAttempts;
    private final int[] numbers = new int[10];
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void printNumbers() {
        int[] enteredNumbers = Arrays.copyOf(this.numbers, countAttempts);
        System.out.print("Ответы игрока " + name + ": ");
        for (int num : enteredNumbers) {
            System.out.print(num == 0 ? "x " : num + " ");
        }
        System.out.println();
    }

    public int getNumber() {
        return numbers[countAttempts - 1];
    }

    public void setNumber(int number) {
        countAttempts++;
        if (number <= 0 || number > 100) {
            System.out.println("Ошибка! Число должно быть в полуинтервале (0; 100]");
        } else {
            numbers[countAttempts - 1] = number;
        }
    }

    public void clear() {
        Arrays.fill(numbers, 0, countAttempts, 0);
        countAttempts = 0;
    }
}