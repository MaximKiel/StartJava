package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer;

        do {
            Scanner scanner = new Scanner(System.in);
            boolean repeat;

            do {
                try {
                System.out.print("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                int result = Calculator.calculate(expression);
                System.out.println(expression + " = " + result);
                repeat = false;
                }
                catch (NumberFormatException exc) {
                    System.out.println("Вы ввели некорректное выражение!");
                    repeat = true;
                }
                catch (IllegalStateException exc) {
                    System.out.println("Вы ввели некорректный знак операции!");
                    repeat = true;
                }

            } while (repeat);

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

        System.out.println("Калькулятор закрывается. До свидания!");
    }
}