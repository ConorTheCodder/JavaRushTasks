package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/


import java.util.Arrays;

public class Solution {

    String b;
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {

        int tmp = 0;
        String a;
        int[] arrayCopy = new int[array.length];

        if ((array.length % 2) == 0) {
            for (int j = 0; j < array.length; j++) {
                tmp = array[j];
                arrayCopy[j] = tmp;
            }
        }
        arrayCopy = new int[tmp];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayCopy[(array.length - 1) - i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
