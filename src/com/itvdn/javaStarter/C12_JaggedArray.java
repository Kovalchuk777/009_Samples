package com.itvdn.javaStarter;

public class C12_JaggedArray {
    // Зубчатые массивы (Jagged Array).

    public static void main(String[] args) {
        int[][] jagged = {
                {1, 2},
                {1, 2, 3, 4, 5},
                {1, 2, 3}
        };

        // Во внешнем цикле выполняется проход по всем вложенным массивам.
        for (int i = 0; i < jagged.length; ++i) {
            // Во внутреннем цикле выполняется обращение к каждому элементу вложенного массива.
            for (int j = 0; j < jagged[i].length; ++j) {
                System.out.print(" " + jagged[i][j]);
            }
            System.out.print("\n");
        }

        for (int[] array : jagged) {
            for (int value : array) {
                System.out.print(value + " ");
            }
           // System.out.print(array);
        }
    }
}
