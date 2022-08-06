package com.lesson_2_3_4.calculator;

public class Calculator {

    private static int result;

    public static String calculate(int num1, String mathSign, int num2) {
        switch (mathSign) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            case "^" -> result = (int) Math.pow(num1, num2);
            case "%" -> result = num1 % num2;
        }
        return num1 + " " + mathSign + " " + num2 + " = " + result;
    }
}