package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }


    public static int min(int[] ints) {

        int minNum = ints[0];

        for (int i = 0; i < ints.length; i++) {
            minNum = Math.min(minNum,ints[i]);
        }
        return minNum;
    }

    public static int[] getArrayOfTenElements() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public void method() {

    }
}

class Test extends Solution {

}
class Test2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.method();

    }
}
