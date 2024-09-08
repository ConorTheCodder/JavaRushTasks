package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код

        boolean isPresent = false;
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        int index = Arrays.binarySearch(arrayCopy, element);
        if (index < 0) {
        } else {
            isPresent = true;
        }

        System.out.println(isPresent);
    }
}
