package com.lesson_2_3_4.array;

public class ArrayTheme {

    private static void printArrayInt(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void printArrayDoubleFewString(double[] array, int counter) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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

    private static void printArrayString (String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int tmp;
        int length = intArray.length;

        System.out.print("Исходный массив: ");

        printArrayInt(intArray);

        for (int i = 0; i < length / 2; i++) {
            tmp = intArray[length - i - 1];
            intArray[length - i - 1] = intArray[i];
            intArray[i] = tmp;
        }

        System.out.print("\nРеверсивный массив: ");

        printArrayInt(intArray);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = intArray[1];
        length = intArray.length;

        for (int i = 1; i < length - 1; i++) {
            sum *= intArray[i];
            System.out.print((i < length - 2) ? (intArray[i] + " * ") : (intArray[i] + " = " + sum));
        }

        System.out.println("\nЭлемент под индексом 0 = " + intArray[0]);

        System.out.println("Элемент под индексом " + (length - 1) + " = " + intArray[length - 1]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArray = new double[15];
        length = doubleArray.length;
        int zeroCounter = 0;

        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }

        System.out.print("Исходный массив: ");

        printArrayDoubleFewString(doubleArray, 7);

        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > doubleArray[7]) {
                doubleArray[i] = 0;
                zeroCounter++;
            }
        }

        System.out.print("Измененный массив: ");

        printArrayDoubleFewString(doubleArray, 7);

        System.out.println("Количество обнуленных ячеек: " + zeroCounter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] symbolArray = new char[26];
        char letter = 'A';
        length = symbolArray.length;

        for (int i = 0; i < length; i++) {
            symbolArray[i] = letter;
            letter++;
        }

        int symCounter = 0;
        int rowCounter = 0;
        int indexCounter = length - 1;

        do {
            while (symCounter <= rowCounter) {
                System.out.print(symbolArray[indexCounter]);
                symCounter++;
                indexCounter--;
            }
            System.out.println();
            indexCounter = length - 1;
            symCounter = 0;
            rowCounter++;
        } while (rowCounter < length);

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;

        for (int i = 0; i < length; i++) {
            intArray[i] = (int) (Math.random() * (100 - 60 + 1) + 60);
        }

        do {
            checkRepeatElements(intArray);
        } while (checkRepeatElements(intArray));


        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    tmp = intArray[j];
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
        String[] stringArray1 = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        String[] stringArray2 = new String[4];
        indexCounter = 0;
        length = stringArray1.length;

        System.out.print("Исходный массив: ");

        printArrayString(stringArray1);

        for (int i = 0; i < length; i++) {
            if (!stringArray1[i].isBlank()) {
                System.arraycopy(stringArray1, i, stringArray2, indexCounter, 1);
                indexCounter++;
            }
        }

        System.out.print("\nНовый массив: ");

        printArrayString(stringArray2);
    }
}
