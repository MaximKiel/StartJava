package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer;

        do {
            Scanner scanner = new Scanner(System.in);
            String mathExp;
            String[] mathExpAr;
            boolean repeat;

            do {
                try {
                System.out.print("Введите математическое выражение: ");
                mathExp = scanner.nextLine();
                mathExpAr = mathExp.split(" ");

                if (Integer.parseInt(mathExpAr[0]) > 0 && Integer.parseInt(mathExpAr[2]) > 0) {
                    System.out.println(Calculator.calculate(mathExpAr));
                        repeat = false;
                    } else {
                        System.out.println("Числа для вычислений должны быть положительными!");
                        repeat = true;
                    }
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