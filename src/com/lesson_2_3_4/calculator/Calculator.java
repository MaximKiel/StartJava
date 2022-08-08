package com.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String expression) {
        String[] expressionArray = expression.split(" ");
        int num1 = Integer.parseInt(expressionArray[0]);
        int num2 = Integer.parseInt(expressionArray[2]);
        char mathSign = expressionArray[1].charAt(0);

        if (num1 > 0 && num2 > 0) {
            return switch (mathSign) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                case '^' -> (int) Math.pow(num1, num2);
                case '%' -> num1 % num2;
                default -> throw new IllegalStateException("Некорректный знак операции!");
            };
        } else throw new NumberFormatException("Числа должны быть положительными!");
    }
}