public class VariablesTheme {

    public static void main(String[] args) {

        System.out.println("1. Создание переменных и вывод их значений на консоль");

        byte coreNumber = 4;
        short ramMemory = 8;
        int systemType = 64;
        long ssdMemory = 475L;
        float cpuFrequency = 2.5F;
        double freeMemory = 294.5;
        char symbol = 'a';
        boolean logicalValue = true;

        System.out.println(coreNumber + " " + ramMemory + " " + systemType + " " + ssdMemory + " " 
                + cpuFrequency + " " + freeMemory + " " + symbol + " " + logicalValue);

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int priceX = 100;
        int priceY = 200;
        double saleSum = (priceX + priceY)*0.11;
        double salePrice = (priceX + priceY) - saleSum;

        System.out.println("Сумма скидки: " + saleSum + " Общая стоимость товаров со скидкой: " 
                + salePrice + "\n");

        System.out.println("3. Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a    " + "\n" + "   J   a a  v   v  a a   " + "\n" 
                + "J  J  aaaaa  V V  aaaaa  " + "\n" + " JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");

        byte maxByte = 127;
        byte incByte = ++maxByte;
        byte decByte = --maxByte;
        short maxShort = 32767;
        short incShort = ++maxShort;
        short dicShort = --maxShort;
        int maxInt = 2147483647;
        int incInt = ++maxInt;
        int decInt = --maxInt;
        long maxLong = 9223372036854775807L;
        long incLong = ++maxLong;
        long decLong = --maxLong;

        System.out.println("byte: " + maxByte + " " + incByte + " " + decByte + "\n"
                + "short: " + maxShort + " " + incShort + " " + dicShort + "\n"
                + "int: " + maxInt + " " + incInt + " " + decInt + "\n"
                + "long: " + maxLong + " " + incLong + " " + decLong);

        System.out.println("\n5. Перестановка значений переменных");

        double variable1 = 1.1;
        double variable2 = 2.2;

        System.out.println("Замена с помощью третьей переменной: " + "\n" + "Исходные значения - переменная 1: " + variable1 + " переменная 2: " + variable2);

        double variableHelp = variable1;
        variable1 = variable2;
        variable2 = variableHelp;

        System.out.println("Новые значения - переменная 1: " + variable1 + " переменная 2: " + variable2);

        System.out.println("Замена с помощью арифметических операций: " + "\n"
                + "Исходные значения - переменная 1: " + variable1 + " переменная 2: " + variable2);

        variable1 = variable1 + variable2;
        variable2 = variable1 - variable2;
        variable1 = variable1 - variable2;

        System.out.println("Новые значения - переменная 1: " + variable1 + " переменная 2: " + variable2);

        System.out.println("Замена с помощью побитовой операции ^: " + "\n"
                + "Исходные значения - переменная 1: " + variable1 + " переменная 2: " + variable2);

        int var1 = (int) (variable1 * 10);
        int var2 = (int) (variable2 * 10);
        var1 = var1 ^ var2;
        var2 = var2 ^ var1;
        var1 = var1 ^ var2;
        variable1 = var1 * 0.1;
        variable2 = var2 * 0.1;

        System.out.println("Новые значения - переменная 1: " + variable1 + " переменная 2: " + variable2);

        System.out.println("\n6. Вывод символов и их кодов");

        int num1 = 35, num2 = 38, num3 = 64, num4 = 94, num5 = 95;
        char symbol1 = (char) num1;
        char symbol2 = (char) num2;
        char symbol3 = (char) num3;
        char symbol4 = (char) num4;
        char symbol5 = (char) num5;

        System.out.println("num1: " + num1 + " символ: " + symbol1 + "\n"
                + "num2: " + num2 + " символ: " + symbol2 + "\n"
                + "num3: " + num3 + " символ: " + symbol3 + "\n"
                + "num4: " + num4 + " символ: " + symbol4 + "\n"
                + "num5: " + num5 + " символ: " + symbol5);

        System.out.println("\n7. Произведение и сумма цифр числа");

        int num = 345;
        int dig1 = num / 100;
        int dig2 = num % 100 / 10;
        int dig3 = num % 10;
        int comp = dig1 * dig2 * dig3;
        int sum = dig1 + dig2 + dig3;

        System.out.println("Сумма цифр числа N = " + sum + "\n"
                + "Произведение цифр числа N = " + comp);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");

        char sym1 = ' ';
        char sym2 = ' ';
        char sym3 = ' ';
        char sym4 = ' ';
        char sym5 = '/';
        char sym6 = 92;
        char sym7 = ' ';
        char sym8 = ' ';
        char sym9 = ' ';
        char sym10 = ' ';
        char sym11 = ' ';
        char sym12 = ' ';
        char sym13 = ' ';
        char sym14 = '/';
        char sym15 = ' ';
        char sym16 = ' ';
        char sym17 = 92;
        char sym18 = ' ';
        char sym19 = ' ';
        char sym20 = ' ';
        char sym21 = ' ';
        char sym22 = ' ';
        char sym23 = '/';
        char sym24 = '_';
        char sym25 = '(';
        char sym26 = ' ';
        char sym27 = ')';
        char sym28 = 92;
        char sym29 = ' ';
        char sym30 = ' ';
        char sym31 = ' ';
        char sym32 = '/';
        char sym33 = ' ';
        char sym34 = ' ';
        char sym35 = ' ';
        char sym36 = ' ';
        char sym37 = ' ';
        char sym38 = ' ';
        char sym39 = 92;
        char sym40 = ' ';
        char sym41 = '/';
        char sym42 = '_';
        char sym43 = '_';
        char sym44 = '_';
        char sym45 = '_';
        char sym46 = '/';
        char sym47 = 92;
        char sym48 = '_';
        char sym49 = '_';
        char sym50 = 92;

        System.out.println("" + sym1 + sym2 + sym3 + sym4 + sym5 + sym6 + sym7 + sym8 + sym9 + sym10 + "\n" +
                sym11 + sym12 + sym13 + sym14 + sym15 + sym16 + sym17 + sym18 + sym19 + sym20 + "\n" +
                sym21 + sym22 + sym23 + sym24 + sym25 + sym26 + sym27 + sym28 + sym29 + sym30 + "\n" +
                sym31 + sym32 + sym33 + sym34 + sym35 + sym36 + sym37 + sym38 + sym39 + sym40 + "\n" +
                sym41 + sym42 + sym43 + sym44 + sym45 + sym46 + sym47 + sym48 + sym49 + sym50);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");

        num = 123;
        num1 = num / 100;
        num2 = num % 100 / 10;
        num3 = num % 10;

        System.out.println("Число N содержит: \n" + num1 + " сотен\n" + num2 + " десятков\n" + num3 + " единиц");

        System.out.println("\n10. Преобразование секунд");

        int seconds = 86399;
        int hour = seconds / (3600);
        int min = seconds / 60 % 60;
        int sec = seconds % (3600) / 60;

        System.out.println(hour + ":" + min + ":" + sec);
    }
}