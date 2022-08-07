package com.lesson_2_3_4.calculator;

public class Calculator {

    public static String calculate(String[] mathExpAr) {
        int num1 = Integer.parseInt(mathExpAr[0]);
        int num2 = Integer.parseInt(mathExpAr[2]);
        char mathSign = mathExpAr[1].charAt(0);
        return switch (mathSign) {
            case '+' -> num1 + " " + mathSign + " " + num2 + " = " + (num1 + num2);
            case '-' -> num1 + " " + mathSign + " " + num2 + " = " + (num1 - num2);
            case '*' -> num1 + " " + mathSign + " " + num2 + " = " + (num1 * num2);
            case '/' -> num1 + " " + mathSign + " " + num2 + " = " + (num1 / num2);
            case '^' -> num1 + " " + mathSign + " " + num2 + " = " + ((int) Math.pow(num1, num2));
            case '%' -> num1 + " " + mathSign + " " + num2 + " = " + (num1 % num2);
            default -> throw new IllegalStateException("Некорректный знак операции!");
        };
    }
}