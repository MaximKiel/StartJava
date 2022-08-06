package com.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTasks {

    public static void main(String[] args) {
        System.out.println("1. Write a Java program to sort a numeric array and a string array.");
        int[] intArray = {5, 8, 12, 6, 19, 1, 9};
        String[] names = {"Alex", "Mark", "John", "Bill", "Tony"};

        System.out.println("Origin numeric array: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(intArray));

        System.out.println("Origin string array: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted string array: " + Arrays.toString(names));

        System.out.println("\n2. Write a Java program to sum values of an array.");
        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);

        System.out.println("\n4. Write a Java program to calculate the average value of array elements.");
        sum = 0;
        for (int i : intArray) {
            sum += i;
        }
        System.out.println("The average value is: " + sum / intArray.length);

        System.out.println("\n5. Write a Java program to test if an array contains a specific value.");
        System.out.println(contains(intArray, 5) ? "The array contains a specific value" :
                "The array doesn't contain a specific value");

        System.out.println("\n6. Write a Java program to find the index of an array element.");
        int srcNum = 5;
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == srcNum) {
                index = i;
            }
        }
        System.out.println("The index of element " + srcNum + " is: " + index);

        System.out.println("\n9. Write a Java program to insert an element (specific position) into an array.");
        srcNum = 99;
        index = 3;
        System.out.println("Origin array: " + Arrays.toString(intArray));
        for (int i = intArray.length - 1; i > index; i--) {
            intArray[i] = intArray[i - 1];
        }
        intArray[index] = srcNum;
        System.out.println("New array: " + Arrays.toString(intArray));

        System.out.println("\n10. Write a Java program to find the maximum and minimum value of an array.");
        System.out.println("Origin array: " + Arrays.toString(intArray));

        int max = intArray[0];
        int min = intArray[0];
        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > max) max = intArray[i];
            if (intArray[i] < min) min = intArray[i];
        }
        System.out.println("Maximum is: " + max + "; minimum is: " + min);

        System.out.println("\n11. Write a Java program to reverse an array of integer values.");
        int[] arrayRevers = {1, 2, 3, 4, 5};

        System.out.println("Origin array: " + Arrays.toString(arrayRevers));

        int tmp = 0;

        for (int i = 0; i < arrayRevers.length / 2; i++) {
            tmp = arrayRevers[i];
            arrayRevers[i] = arrayRevers[arrayRevers.length - 1 - i];
            arrayRevers[arrayRevers.length - 1 - i] = tmp;
        }
        System.out.println("Revers array: " + Arrays.toString(arrayRevers));

        System.out.println("\n12. Write a Java program to find the duplicate values of an array of integer values.");
        intArray = new int[]{1, 6, 8, 6, 9, 1, 5, 2, 3, 2};

        System.out.println("Origin array: " + Arrays.toString(intArray));

        System.out.print("The duplicates are: ");

        int duplicate = 0;

        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    System.out.print(intArray[i] + " ");
                    duplicate++;
                }
            }
        }

        System.out.println("\nThe quantity of duplicates is: " + duplicate);

        System.out.println("\n14. Write a Java program to find the common elements between two arrays (string values).");
        String[] strArray1 = {"Anna", "Alex", "Bill", "John", "Mark", "Max"};
        String[] strArray2 = {"Alex", "Jack", "Max", "Rick", "Sam"};

        System.out.println("Origin arrays are: " + "\n" + Arrays.toString(strArray1) + "\n" + Arrays.toString(strArray2));

        System.out.print("The common elements are: ");

        for (int i = 0; i < strArray1.length; i++) {
            for (int j = 0; j < strArray2.length; j++) {
                if (strArray1[i].equals(strArray2[j])) {
                    System.out.print(strArray1[i] + " ");
                }
            }
        }

        System.out.println("\n17. Write a Java program to find the second largest element in an array.");
        intArray = new int[]{1, 0, 6, 9, 7, 5};

        System.out.println("Origin array: " + Arrays.toString(intArray));
        max = intArray[0];
        int maxSecond = intArray[0];

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > max) max = intArray[i];
            if (intArray[i] > maxSecond && intArray[i] < max) maxSecond = intArray[i];
        }

        System.out.println("The second largest element is: " + maxSecond);

        System.out.println("\n18. Write a Java program to find the second smallest element in an array.");
        min = intArray[0];
        int minSecond = intArray[0];

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] < min) min = intArray[i];
            if (intArray[i] < minSecond && intArray[i] > min) minSecond = intArray[i];
        }

        System.out.println("The second smallest element is: " + minSecond);

        System.out.println("\nTest the Array class.");
        int[] array1 = {1, 3, 5, 7, 2, 4, 6};

        System.out.println("Origin array: " + Arrays.toString(array1));

        int[] array2 = Arrays.copyOf(array1, array1.length);

        System.out.println("array2 by copyOf() array1: " + Arrays.toString(array2));

        int[] arrayOfRange = Arrays.copyOfRange(array1, 2, array1.length);

        System.out.println("arrayOfRange by copyOfRange() array1: " + Arrays.toString(arrayOfRange));

        Arrays.sort(array1);

        System.out.println("Sorted array1: " + Arrays.toString(array1));

        Arrays.binarySearch(array1, 5);

        System.out.println("Index of number 5 by binarySearch(): " + Arrays.binarySearch(array1, 5));

        Arrays.fill(array2, 7);

        System.out.println("array2 by fill() 7: " + Arrays.toString(array2));

        System.out.println("Is array1 equals array2: " + Arrays.equals(array1, array2));

        System.out.println("\n22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.");
        int[] array3 = {1, 3, 7, 5, 9};

        System.out.println("Origin array: " + Arrays.toString(array3));

        int specifiedNumber = 8;

        for (int i = 0; i < array3.length - 1; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if ((array3[i] + array3[j]) == specifiedNumber) {
                    System.out.println("The sum of elements " + array3[i] + " and " + array3[j] +
                            " equals the specified number " + specifiedNumber);
                }
            }
        }

        System.out.println("\n23. Write a Java program to test the equality of two arrays.");
        int[] array4 = {8, 1, 2, 7, 4, 9};
        int[] array5 = {1, 3, 7, 5, 10, 9};

        if (Arrays.equals(array4, array5)) System.out.println("Two arrays are equal");
        else System.out.println("Two arrays aren't equal");

        System.out.println("\n25. Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.");
        int[] array6 = {1, 0, 7, 6, 11, 20};

        Arrays.sort(array4);
        Arrays.sort(array5);
        Arrays.sort(array6);

        System.out.println("Origin arrays: " + "\n" + Arrays.toString(array4) + "\n" + Arrays.toString(array5) +
                "\n" + Arrays.toString(array6));

        System.out.print("The common elements are: ");

        for (int i = 0; i < array4.length - 1; i++) {
            for (int j = 0; j < array5.length; j++) {
                for (int k = 0; k < array6.length; k++) {
                    if (array4[i] == array5[j] && array5[j] == array6[k]) {
                        System.out.print(array4[i] + " ");
                    }
                }
            }
        }
    }

    private static boolean contains(int[] array, int specificValue) {
        System.out.println("The specific value is: " + specificValue);
        for (int i : array) {
            if (i == specificValue) {
                return true;
            }
        }
        return false;
    }
}
