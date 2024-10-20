package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");
        checkSumSign(1, 5);
        printColor(100);
        compareNumbers(2, 2);
        System.out.println(amountBelongsRange(5, 15));
        checkingNumberPositivity(-5);
        System.out.println(checkingNumberPositivity1(-1));
        printString("zxc", 3);
        System.out.println(leapYear(2024));
        System.out.println(Arrays.toString(replacingArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0})));
        System.out.println(Arrays.toString(fillingArray(100)));
        System.out.println(Arrays.toString(multiplyingArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        System.out.println(Arrays.deepToString(diagonalArray(5)));
        System.out.println(Arrays.toString(creatingArray(10, 3)));
    }

    public static int[] creatingArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static int[][] diagonalArray(int len) {
        int[][] array = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++)
                if (i == j || i + j == len - 1) {
                    array[i][j] = 1;
                }
        }
        return array;
    }

    public static int[] multiplyingArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6) {
                array[i] *= 2;
            }
        return array;
    }

    public static int[] fillingArray(int len) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] replacingArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 & year % 100 != 0) || year % 400 == 0;
    }

    public static void printString(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
        }
    }

    public static void printThreeWords(String word1, String word2, String word3) {
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }

    public static void checkSumSign(int a, int b) {
        if (a + b < 0) {
            System.out.println("Cумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }

    public static void printColor(int value) {
        if (value < 1) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean amountBelongsRange(int a, int b) {
        return (a + b) > 9 & (a + b) < 21;
    }

    public static void checkingNumberPositivity(int a) {
        if (a < 0) {
            System.out.println("число отрицательное");
        } else {
            System.out.println("число положительное");
        }
    }

    public static boolean checkingNumberPositivity1(int a) {
        return a >= 0;
    }
}