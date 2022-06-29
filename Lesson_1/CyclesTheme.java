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

        System.out.println("В промежутке [-10; 21] четных чисел = " + evenNum + ", а нечетных = " + unevenNum);

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
        int digNum;
        int sum = 0;

        while (num > 0) {
            digNum = num % 10;
            System.out.print(digNum);
            sum += digNum;
            num /= 10;
        }

        System.out.println("\n" + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int j = 0;
        
        for (int i = 1; i < 24; i += 2) {
            j += 1;
            System.out.printf("%3d", i);
            if (j % 5 == 0) {
                System.out.print("\n");
            }
        }
        
        int quantityZero = 5 - (j %= 5);
        
        for (int i = 0; i < quantityZero; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n5. Проверка количества единиц на четность");

        num = 3141591;
        int digOne = 0;
        
        while (num > 0) {
            digNum = num % 10;
            if (digNum == 1) {
                digOne += digNum;
            }
            num /= 10;
        }
        
        if (digOne % 2 == 0) {
            System.out.println("Число 3141591 содержит " + digOne + " четное количество единиц");
        } else {
            System.out.println("Число 3141591 содержит " + digOne + " нечетное количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");

        for (int i = 0; i <= 5; i++) {
            System.out.println("**********");
        }

        System.out.print("\n");

        char[] sym1 = {'#', '#', '#', '#', '#'};
        System.out.println(sym1);

        int i = 0;
        int j = 3;
        while (j >= 0){
            while (i <= j) {
                System.out.print(sym1[i]);
                i++;
            }
            System.out.print("\n");
            i = 0;
            j--;
            }

        System.out.print("\n");

        char[] sym2 = {'$', '$', '$'};
        i = 0;
        j = 0;
        do {
            do {
                System.out.print(sym2[i]);
                i++;
            } while (i <= j);
            System.out.print("\n");
            i = 0;
            j++;
        } while (j <= 2);

        i = 0;
        j = 1;

        do {
            do {
                System.out.print(sym2[i]);
                i++;
            } while (i <= j);
            System.out.print("\n");
            i = 0;
            j--;
        } while (j >= 0);

        System.out.println("\n7. Отображение ASCII-символов");

        char j;
        
        System.out.print("Dec" + "  Char");
        
        for (int i = 0; i <= 47; i++){
            if (i % 2 != 0) {
                System.out.println("\n");
                System.out.printf("%3d", i);
                j = (char) i;
                System.out.printf("%6s", j);
            }
        }
        
        for (int i = 97; i <= 122; i++){
            if (i % 2 == 0) {
                System.out.println("\n");
                System.out.printf("%3d", i);
                j = (char) i;
                System.out.printf("%6s", j);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        int num1 = 1234321;
        int[] numArray = new int[7];
        int digNum;
        int i = 0;
        
        while (num1 > 0) {
            digNum = num1 % 10;
            numArray[i] = digNum;
            num1 /= 10;
            i++;
        }
        
        num1 = 1234321;
        int num2 = 0;
        
        for (int j : numArray){
            num2 = 10 * num2 + j;
        }
        
        if (num1 == num2) {
            System.out.println("Число " + num1 + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
    }
}