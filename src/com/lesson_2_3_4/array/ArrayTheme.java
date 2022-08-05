package com.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Исходный массив: ");
        printArrayInt(intArray);

        int length = intArray.length;

        for (int i = 0; i < length / 2; i++) {
            int tmp = intArray[length - i - 1];
            intArray[length - i - 1] = intArray[i];
            intArray[i] = tmp;
        }

        System.out.print("\nРеверсивный массив: ");
        printArrayInt(intArray);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        int mult = intArray[1];
        length = intArray.length;

        for (int i = 2; i < length - 1; i++) {
            mult *= intArray[i];
            System.out.print(intArray[i]);
            System.out.print((i < length - 2) ?  " * " : " = " + mult);
        }

        System.out.println("\nЭлемент под индексом 0 = " + intArray[0]);
        System.out.println("Элемент под индексом " + (length - 1) + " = " + intArray[length - 1]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArray = new double[15];
        length = doubleArray.length;

        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }

        System.out.print("Исходный массив: ");
        printArrayDouble(doubleArray, length / 2);

        int zeroCounter = 0;
        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > doubleArray[7]) {
                doubleArray[i] = 0;
                zeroCounter++;
            }
        }

        System.out.print("Измененный массив: ");
        printArrayDouble(doubleArray, length / 2);

        System.out.println("Количество обнуленных ячеек: " + zeroCounter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] symbolsArray = new char[26];
        char letter = 'A';
        length = symbolsArray.length;

        for (int i = 0; i < length; i++) {
            symbolsArray[i] = letter++;
        }

        int indexCounter = length - 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbolsArray[indexCounter]);
                indexCounter--;
            }
            System.out.println();
            indexCounter = length - 1;
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;

        for (int i = 0; i < length; i++) {
            intArray[i] = (int) (Math.random() * (100 - 60 + 1) + 60);
            do {
                if (!checkRepeatElements(intArray)) break;
            } while (true);
        }

        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;
                }
            }
        }

        for (int i = 1; i <= length; i++) {
            System.out.print(intArray[i - 1] + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcArrayStrings = {"", "AA", "", "BBB", "CC", "D", "", "E", "FF", "G", ""};
        length = srcArrayStrings.length;

        System.out.print("Исходный массив: ");
        printArrayString(srcArrayStrings);

        System.out.print("\nНовый массив: ");

        int newLength = 0;
        for (int i = 0; i < length; i++) {
            if (!srcArrayStrings[i].isBlank()) {
                newLength++;
            }
        }

        String[] destArrayStrings = new String[newLength];

        newLength = 0;
        for (int i = 0; i < length; i++) {
            if (!srcArrayStrings[i].isBlank()) {
                System.arraycopy(srcArrayStrings, i, destArrayStrings, newLength, 1);
                newLength++;
            }
        }
        printArrayString(destArrayStrings);
    }

    private static void printArrayInt(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void printArrayDouble(double[] array, int counter) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%6.3f", array[i]);
            if (i != 0 && i % counter == 0) {
                System.out.println();
            }
        }
    }

    private static boolean checkRepeatElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = (int) (Math.random() * (100 - 60 + 1) + 60);
                    return true;
                }
            }
        }
        return false;
    }

    private static void printArrayString(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
