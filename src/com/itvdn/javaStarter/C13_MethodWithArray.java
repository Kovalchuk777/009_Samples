package com.itvdn.javaStarter;

public class C13_MethodWithArray {

    static int[] modifyArray(int[] array, int modifier) {


        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * modifier;
            modifier++;
        }


     //   modifier++;

        System.out.println("Method: " + modifier);

        return array;

    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        int modifier = 5;

       // myArray = modifyArray(myArray, modifier);
        modifyArray(myArray, modifier);

        System.out.println(modifier);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }

    }

}
