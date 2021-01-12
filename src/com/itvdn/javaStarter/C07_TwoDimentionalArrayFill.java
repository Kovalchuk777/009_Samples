package com.itvdn.javaStarter;

public class C07_TwoDimentionalArrayFill {
    // Массивы (двумерный массив).
    public static void main(String[] args) {
        // Компилятор определяет размер массива на основании выражения инициализации.
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


    //    System.out.println(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }

        for (int[] arr : array) {
            for (int value : arr) {
                System.out.println(value);
            }
        }

    }

}
