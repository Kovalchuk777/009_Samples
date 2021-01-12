package com.itvdn.javaStarter;

public class C01_Arrays {
    // Массивы (одномерный массив).

    public static void main(String[] args) {
        // На 9 строке создаем массив целочисленных элементов с именем array размерностью в 5 элементов

        byte[] array = new byte[5];


        // На 13 строке элементу массива array по индексу 0 присваиваем значение 10

        System.out.println(array);



        int i = 0;
        int k = 1;
        array[i] = 1;
        array[k] = 2;
        i = 2;
        array[i] = 3;
        array[3] = 20;
        array[4] = 25;
      //  array[5] = 30;

        // На 21 строке выводим на экран значение элемента массива array по индексу 0

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
