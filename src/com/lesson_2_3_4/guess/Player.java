package com.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private int counter;
    private final int[] numbers = new int[10];
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void getNumbers() {
        int[] enteredNumbers = Arrays.copyOf(this.numbers, counter);
        System.out.print("Ответы игрока " + name + ": ");
        for (int num : enteredNumbers) {
            System.out.print(num == 0 ? "x " : num + " ");
        }
        System.out.println();
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public void setNumbers(int number, int index) {
        if (number <= 0 || number > 100) {
            System.out.println("Ошибка! Число должно быть в полуинтервале (0; 100]");
        } else {
            numbers[index - 1] = number;
        }
    }

    public void numbersToZero() {
        Arrays.fill(numbers, 0);
    }
}