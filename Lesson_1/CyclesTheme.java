public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int evenNum = 0;
        int unevenNum = 0;

        do {
            if (num % 2 == 0) {
                evenNum++;
            } else {
                unevenNum++;
            }
            num++;
        } while (num <= 21);

        System.out.println("В промежутке [-10; 21] сумма четных чисел = " + evenNum + ", а нечетных = " + unevenNum);

        System.out.println("\n2. Вывод чисел в интервале между (max и min)");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum;
        int minNum;

        if (num1 < num2 && num1 < num3){
            minNum = num1;
        } else if (num2 < num1 && num2 < num3){
            minNum = num2;
        } else {
            minNum = num3;
        }

        if (num1 > num2 && num1 > num3){
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3){
            maxNum = num2;
        } else {
            maxNum = num3;
        }

        for (int i = maxNum; i >= minNum; i--){
            System.out.println(i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        num = 1234;
        int digitNum;
        int sumDigit = 0;

        while (num > 0) {
            digitNum = num % 10;
            System.out.print(digitNum);
            sumDigit += digitNum;
            num /= 10;
        }

        System.out.println("\n" + sumDigit);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int counter = 0;

        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            counter += 1;
            if (counter % 5 == 0) {
                System.out.print("\n");
            }
        }

        for (int i = 0; i < (5 - (counter %= 5)); i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        num = 3141591;
        int digitOne = 0;

        while (num > 0) {
            digitNum = num % 10;
            if (digitNum == 1) {
                digitOne += digitNum;
            }
            num /= 10;
        }

        if (digitOne % 2 == 0) {
            System.out.println("Число 3141591 содержит " + digitOne + " (четное) количество единиц");
        } else {
            System.out.println("Число 3141591 содержит " + digitOne + " (нечетное) количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        char star = '*';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(star);
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        char sharp = '#';
        int symCounter = 0;
        int rowCounter = 4;

        while (rowCounter >= 0){
            while (symCounter <= rowCounter) {
                System.out.print(sharp);
                symCounter++;
            }
            System.out.print("\n");
            symCounter = 0;
            rowCounter--;
        }

        System.out.print("\n");

        char dollar = '$';
        symCounter = 0;
        rowCounter = 0;

        do {
            do {
                System.out.print(dollar);
                symCounter++;
            } while (symCounter <= rowCounter);
            System.out.print("\n");
            symCounter = 0;
            rowCounter++;
        } while (rowCounter <= 2);

        symCounter = 0;
        rowCounter = 1;

        do {
            do {
                System.out.print(dollar);
                symCounter++;
            } while (symCounter <= rowCounter);
            System.out.print("\n");
            symCounter = 0;
            rowCounter--;
        } while (rowCounter >= 0);

        System.out.println("\n7. Отображение ASCII-символов");
        char someChar;

        System.out.print("Dec" + "  Char");

        for (int i = 0; i <= 47; i++){
            if (i % 2 != 0) {
                System.out.print("\n");
                System.out.printf("%3d", i);
                someChar = (char) i;
                System.out.printf("%6s", someChar);
            }
        }

        for (int i = 97; i <= 122; i++){
            if (i % 2 == 0) {
                System.out.print("\n");
                System.out.printf("%3d", i);
                someChar = (char) i;
                System.out.printf("%6s", someChar);
            }
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        num1 = 1234321;
        int[] num1Array = new int[7];
        digitNum = 0;
        counter = 0;

        while (num1 > 0) {
            digitNum = num1 % 10;
            num1Array[counter] = digitNum;
            num1 /= 10;
            counter++;
        }

        num1 = 1234321;
        num2 = 0;

        for (int i : num1Array){
            num2 = 10 * num2 + i;
        }

        if (num1 == num2) {
            System.out.println("Число " + num1 + " является палиндромом");
        } else {
            System.out.println("Число " + num1 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num1 = 143224;
        int[] num1Array1 = new int[6];
        int[] num1Array2 = new int[6];
        digitNum = 0;
        counter = 0;

        while (num1 > 0) {
            digitNum = num1 % 10;
            if (counter <= 2) {
                num1Array1[counter] = digitNum;
            }
            if (counter > 2){
                num1Array2[counter] = digitNum;
            }
            num1 /= 10;
            counter++;
        }

        System.out.println("Сумма цифр " + num1Array1[2] + num1Array1[1] + num1Array1[0] + " = "
                + (num1Array1[2] + num1Array1[1] + num1Array1[0]));
        System.out.println("Сумма цифр " + num1Array2[5] + num1Array2[4] + num1Array2[3] + " = "
                + (num1Array2[5] + num1Array2[4] + num1Array2[3]));

        num1 = 143224;

        if ((num1Array1[2] + num1Array1[1] + num1Array1[0]) == (num1Array2[5] + num1Array2[4] + num1Array2[3])) {
            System.out.println("Число " + num1 + " является счастливым");
        } else {
            System.out.println("Число " + num1 + " не является счастливым");
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
                        System.out.print("\n");
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
            System.out.print("\n");
        }
    }
}