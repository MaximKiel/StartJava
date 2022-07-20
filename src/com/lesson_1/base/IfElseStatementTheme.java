package com.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 24;
        if (age > 20) {
            System.out.println("Вы взрослый человек");
        } else {
            System.out.println("Вы молодой человек");
        }

        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("Вы женщина");
        }

        double height = 1.87;
        if (height < 1.80) {
            System.out.println("Вы невысокий человек");
        } else {
            System.out.println("Вы высокий человек");
        }

        char firstLetterName = "Max".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Вас, наверное, зовут Максим");
        } else if (firstLetterName == 'I') {
            System.out.println("Вас, наверное, зовут Иван");
        } else {
            System.out.println("Ваше имя не Максим и не Иван");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 7;
        int num2 = 19;
        if (num1 > num2) {
            System.out.println("max: " + num1 + " min: " + num2);
        } else {
            System.out.println("max: " + num2 + " min: " + num1);
        }

        System.out.println("\n3. Работа с числом");
        num1 = 23;
        if (num1 == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (num1 % 2 == 0) {
                System.out.println("Число " + num1 + " четное");
            } else {
                System.out.println("Число " + num1 + " нечетное");
            }

            if (num1 > 0) {
                System.out.println("Число " + num1 + " положительное");
            } else {
                System.out.println("Число " + num1 + " отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 523;

        System.out.println("Первое число: " + num1 + " Второе число: " + num2);

        int firstDigitNum1 = num1 / 100;
        int secondDigitNum1 = num1 % 100 / 10;
        int thirdDigitNum1 = num1 % 10;
        int firstDigitNum2 = num2 / 100;
        int secondDigitNum2 = num2 % 100 / 10;
        int thirdDigitNum2 = num2 % 10;

        System.out.println("Одинаковые цифры в обоих числах, стоящие на одном и том же разряде: ");

        if (firstDigitNum1 == firstDigitNum2) {
            System.out.println(firstDigitNum1 + " на разряде сотен");
        }

        if (secondDigitNum1 == secondDigitNum2) {
            System.out.println(secondDigitNum1 + " на разряде десятков");
        }

        if (thirdDigitNum1 == thirdDigitNum2) {
            System.out.println(thirdDigitNum1 + " на разряде едениц");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char unknownChar = '\u0057';
        if ((unknownChar >= 'a' && unknownChar <= 'z') || (unknownChar >='A' && unknownChar <= 'Z')) {
            System.out.println(unknownChar + " это буква");
        } else if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.println(unknownChar + " это число");
        } else {
            System.out.println(unknownChar + " это не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int bankRate;
        if (deposit < 100000) {
            bankRate = 5;
        } else if (deposit >= 100000 && deposit <= 300000) {
            bankRate = 7;
        } else {
            bankRate = 10;
        }
        int sumBankRate = deposit * bankRate / 100;

        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный %: " + sumBankRate);
        System.out.println("Итоговая сумма с %: " + (deposit + sumBankRate));

        System.out.println("\n7. Определение оценки по предметам");
        int percentGradeHistory = 59;
        int percentGradeProgramming = 91;
        int gradeHistory = 0;
        int gradeProgramming = 0;
        if (percentGradeHistory <= 60) {
            System.out.println((gradeHistory = 2) + " - оценка по истории");
        } else if (percentGradeHistory > 60 && percentGradeHistory <= 73) {
            System.out.println((gradeHistory = 3) + " - оценка по истории");
        } else if (percentGradeHistory > 73 && percentGradeHistory <= 91) {
            System.out.println((gradeHistory = 4) + " - оценка по истории");
        } else if (percentGradeHistory > 91) {
            System.out.println((gradeHistory = 5) + " - оценка по истории");
        }

        if (percentGradeProgramming <= 60) {
            System.out.println((gradeProgramming = 2) + " - оценка по программированию");
        } else if (percentGradeProgramming > 60 && percentGradeProgramming <= 73) {
            System.out.println((gradeProgramming = 3) + " - оценка по программированию");
        } else if (percentGradeProgramming > 73 && percentGradeProgramming <= 91) {
            System.out.println((gradeProgramming = 4) + " - оценка по программированию");
        } else if (percentGradeProgramming > 91) {
            System.out.println((gradeProgramming = 5) + " - оценка по программированию");
        }

        System.out.println("Средний балл оценок по предметам: " + ((gradeHistory + gradeProgramming) / 2));
        System.out.println("Средний % по предметам: " + ((percentGradeHistory + percentGradeProgramming) / 2));

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int revenue = 13000;
        int productCost = 9000;
        int profit = (revenue - rent - productCost) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int srcMoney = 567;
        int banknoteHundred = srcMoney / 100;
        int banknoteTen = srcMoney % 100 / 10;
        int banknoteOne = srcMoney % 10;
        if (banknoteTen > 5) {
            banknoteOne += ((banknoteTen - 5) * 10);
            banknoteTen = 5;
        }

        System.out.println("Банкноты 100 USD: " + banknoteHundred);
        System.out.println("Банкноты 10 USD: " + banknoteTen);
        System.out.println("Банкноты 1 USD: " + banknoteOne);
        System.out.println("Исходная сумма: " + (banknoteHundred * 100 + banknoteTen * 10 + banknoteOne) + " USD");
    }
}