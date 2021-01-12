package com.itvdn.javaStarter;

public class C06_TwoDimentionalArrayFill {
    // Массивы (двумерный массив).

    public static void main(String[] args) {
        final int SIZE_I = 3;
        final int SIZE_J = 3;

        int[][] array = new int[SIZE_I][SIZE_J];


        // Заполнение массива
        for (int i = 0; i < SIZE_I; i++) {
            for (int j = 0; j < SIZE_J; j++) {
                array[i][j] = i * j + 1;
            }
        }

        for (int i = 0; i < SIZE_I; i++) {
            for (int j = 0; j < SIZE_J; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }

    }
}
