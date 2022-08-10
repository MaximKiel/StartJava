package com.lesson_2_3_4.guess;

public class Player {

    private int number;
    private final int[] numberArray = new int[10];
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int[] getNumberArray() {
        return numberArray;
    }

    public void setNumberArray(int number, int index) {
        this.number = number;
        if (number > 0 && number <= 100) {
            numberArray[index - 1] = number;
        }
    }
}