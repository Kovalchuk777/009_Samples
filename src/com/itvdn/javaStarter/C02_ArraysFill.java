package com.itvdn.javaStarter;

public class C02_ArraysFill {

    // Массивы (одномерный массив).

    public static void main(String[] args) {
        int[] array = new int[5];



        // Заполнение массива.
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Вывод на экран значений элементов массива.
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            System.out.println(a);
        }


        // Специальная запись цикла for для прохождения элементов массива (Java 8)
        // Аналогична конструкции foreach, используемой в других языках программирования (например C#, PHP)
        // for (int ключ, массив)
        for (int a : array) {
            System.out.print(a + " ");
        }

    }
}
