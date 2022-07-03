public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.println("В промежутке [-10; 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале между (max и min)");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum;
        int minNum;

        if (num1 < num2 && num1 < num3) {
            minNum = num1;
        } else if (num2 < num1 && num2 < num3) {
            minNum = num2;
        } else {
            minNum = num3;
        }

        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }

        for (int i = --maxNum; i > minNum; i--) {
            System.out.println(i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int digit;
        int sumDigits = 0;

        while (srcNum > 0) {
            digit = srcNum % 10;
            System.out.print(digit);
            sumDigits += digit;
            srcNum /= 10;
        }

        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counter = 0;

        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
            }
        }

        for (int i = 0; i < (5 - (counter %= 5)); i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        int num = 3141591;
        int countOnes = 0;

        while (num > 0) {
            digit = num % 10;
            if (digit == 1) {
                countOnes += digit;
            }
            num /= 10;
        }

        num = 3141591;

        if (countOnes % 2 == 0) {
            System.out.println("Число " + num + " содержит " + countOnes + " (четное) количество единиц");
        } else {
            System.out.println("Число " + num + " содержит " + countOnes + " (нечетное) количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int symCounter = 0;
        int rowCounter = 4;

        while (rowCounter >= 0) {
            while (symCounter <= rowCounter) {
                System.out.print("#");
                symCounter++;
            }
            System.out.println();
            symCounter = 0;
            rowCounter--;
        }

        System.out.println();

        symCounter = 0;
        rowCounter = 0;

        do {
            do {
                System.out.print("$");
                symCounter++;
            } while (symCounter <= rowCounter);
            System.out.println();
            symCounter = 0;
            rowCounter++;
        } while (rowCounter < 2);

        do {
            do {
                System.out.print("$");
                symCounter++;
            } while (symCounter <= rowCounter);
            System.out.println();
            symCounter = 0;
            rowCounter--;
        } while (rowCounter >= 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.print("Dec" + "  Char");

        for (int i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("\n%3d %5s", i, (char) i);
            }
        }

        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("\n%3d %5s", i, (char) i);
            }
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        num1 = 1234321;
        counter = 0;
        num2 = 0;

        while (num1 > 0) {
            digit = num1 % 10;
            num2 = 10 * num2 + digit;
            num1 /= 10;
            counter++;
        }

        num1 = 1234321;

        if (num1 == num2) {
            System.out.println("Число " + num1 + " является палиндромом");
        } else {
            System.out.println("Число " + num1 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 143224;
        num1 = 0;
        num2 = 0;
        counter = 0;
        int sumNum1 = 0;
        int sumNum2 = 0;

        while (srcNum > 0) {
            digit = srcNum % 10;
            if (counter <= 2) {
                sumNum1 += digit;
                num1 = 10 * num1 + digit;
            }
            if (counter > 2) {
                sumNum2 += digit;
                num2 = 10 * num2 + digit;
            }
            srcNum /= 10;
            counter++;
        }

        System.out.println("Сумма цифр " + num1 + " = "+ sumNum1);
        System.out.println("Сумма цифр " + num2 + " = "+ sumNum2);

        srcNum = 143224;

        if (sumNum1 == sumNum2) {
            System.out.println("Число " + srcNum + " является счастливым");
        } else {
            System.out.println("Число " + srcNum + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++)
                if (i == 1) {
                    if (j == 1) {
                        System.out.print("  |");
                    } else if (j <= 8) {
                        System.out.printf("%3d", i * j);
                    }
                    if (j == 9) {
                        System.out.printf("%3d", i * j);
                        System.out.println();
                        for (int k = 1; k < 28; k++) {
                            System.out.print("-");
                        }
                    }
                } else {
                    if (j == 1) {
                        System.out.print(i * j);
                        System.out.print(" |");
                    } else {
                        System.out.printf("%3d", i * j);
                    }
                }
            System.out.println();
        }
    }
}