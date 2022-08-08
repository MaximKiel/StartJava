package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer;

        do {
            Scanner scanner = new Scanner(System.in);

            do {
                try {
                    System.out.print("Введите математическое выражение: ");
                    String expression = scanner.nextLine();
                    System.out.println(expression + " = " + Calculator.calculate(expression));
                    break;
                } catch (NumberFormatException | IllegalStateException e) {
                    System.out.println(e.getMessage());
                }

            } while (true);

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

        System.out.println("Калькулятор закрывается. До свидания!");
    }
}