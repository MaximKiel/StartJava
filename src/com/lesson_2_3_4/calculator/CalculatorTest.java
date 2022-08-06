package com.lesson_2_3_4.calculator;

import java.util.Scanner;
import static com.lesson_2_3_4.calculator.Calculator.calculate;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        String mathExp;
        String[] mathExpAr;
        boolean repeat;

        do {
            do {
                try {
                    System.out.print("Введите математическое выражение: ");
                    mathExp = scanner.nextInt() + " " + scanner.next().charAt(0) + " " + scanner.nextInt();
                    mathExpAr = mathExp.split(" ");

                    if (Integer.parseInt(mathExpAr[0]) > 0 && Integer.parseInt(mathExpAr[2]) > 0) {
                        System.out.println(calculate(Integer.parseInt(mathExpAr[0]),
                                mathExpAr[1], Integer.parseInt(mathExpAr[2])));
                        repeat = false;
                    } else {
                        System.out.println("Числа для вычислений должны быть положительными!");
                        repeat = true;
                    }
                }
                catch (Throwable exc) {
                    System.out.println("Вы ввели некорректное выражение!");
                    repeat = true;
                    scanner.next();
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