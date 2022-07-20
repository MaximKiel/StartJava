package com.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte coreNumber = 4;
        short ram = 8;
        int cpuArch = 64;
        long ssdValue = 475L;
        float cpuFrequency = 2.5F;
        double freeMemory = 294.5;
        char symbol = 'a';
        boolean logicalValue = true;

        System.out.println(coreNumber + " " + ram + " " + cpuArch + " " + ssdValue + " "
                + cpuFrequency + " " + freeMemory + " " + symbol + " " + logicalValue);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        double discount = (priceGoodsX + priceGoodsY) * 0.11;
        double discountPrice = (priceGoodsX + priceGoodsY) - discount;

        System.out.println("Сумма скидки: " + discount + " Общая стоимость товаров со скидкой: "
                + discountPrice + "\n");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a    " + "\n" + "   J   a a  v   v  a a   " + "\n"
                + "J  J  aaaaa  V V  aaaaa  " + "\n" + " JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;

        System.out.println("byte: " + maxByte + " " + ++maxByte + " " + --maxByte + "\n"
                + "short: " + maxShort + " " + ++maxShort + " " + --maxShort + "\n"
                + "int: " + maxInt + " " + ++maxInt + " " + --maxInt + "\n"
                + "long: " + maxLong + " " + ++maxLong + " " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        double number1 = 1.1;
        double number2 = 2.2;

        System.out.println("Замена с помощью третьей переменной: " + "\n" +
                "Исходные значения - переменная 1: " + number1 + " переменная 2: " + number2);
        double buffer = number1;
        number1 = number2;
        number2 = buffer;
        System.out.println("Новые значения - переменная 1: " + number1 + " переменная 2: " + number2);

        System.out.println("Замена с помощью арифметических операций: " + "\n"
                + "Исходные значения - переменная 1: " + number1 + " переменная 2: " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("Новые значения - переменная 1: " + number1 + " переменная 2: " + number2);

        System.out.println("Замена с помощью побитовой операции ^: " + "\n"
                + "Исходные значения - переменная 1: " + number1 + " переменная 2: " + number2);
        int tmp1 = (int) (number1 * 10);
        int tmp2 = (int) (number2 * 10);
        tmp1 ^= tmp2;
        tmp2 ^= tmp1;
        tmp1 ^= tmp2;
        number1 = tmp1 * 0.1;
        number2 = tmp2 * 0.1;
        System.out.println("Новые значения - переменная 1: " + number1 + " переменная 2: " + number2);

        System.out.println("\n6. Вывод символов и их кодов");
        int charCode1 = 35, charCode2 = 38, charCode3 = 64, charCode4 = 94, charCode5 = 95;

        System.out.println("charCode1: " + charCode1 + " символ: " + (char) charCode1 + "\n"
                + "charCode2: " + charCode2 + " символ: " + (char) charCode2 + "\n"
                + "charCode3: " + charCode3 + " символ: " + (char) charCode3 + "\n"
                + "charCode4: " + charCode4 + " символ: " + (char) charCode4 + "\n"
                + "charCode5: " + charCode5 + " символ: " + (char) charCode5);

        System.out.println("\n7. Произведение и сумма цифр числа");
        int srcNum = 345;
        int digit1 = srcNum / 100;
        int digit2 = srcNum % 100 / 10;
        int digit3 = srcNum % 10;
        int multDigits = digit1 * digit2 * digit3;
        int sumDigits = digit1 + digit2 + digit3;

        System.out.println("Сумма цифр числа N = " + sumDigits + "\n"
                + "Произведение цифр числа N = " + multDigits);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char slash = '/';
        char backslash = 92;
        char underscore = '_';
        char open = '(';
        char close = ')';

        System.out.println("" + space + space + space + space + slash + backslash + space + space + space + space +
                "\n" + space + space + space + slash + space + space + backslash + space + space + space + "\n" +
                space + space + slash + underscore + open + space + close + backslash + space + space + "\n" +
                space + slash + space + space + space + space + space + space + backslash + space + "\n" +
                slash + underscore + underscore + underscore + underscore + slash + backslash + underscore +
                underscore + backslash);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
        srcNum = 123;
        int hundred = srcNum / 100;
        int ten = srcNum % 100 / 10;
        int one = srcNum % 10;

        System.out.println("Число N содержит: \n" + hundred + " сотен\n" + ten + " десятков\n" + one + " единиц");

        System.out.println("\n10. Преобразование секунд");
        int totalSec = 86399;
        int hour = totalSec / 3600;
        int min = totalSec / 60 % 60;
        int sec = totalSec % 60;

        System.out.println(hour + ":" + min + ":" + sec);
    }
}