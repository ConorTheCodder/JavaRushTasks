package com.javarush.task.pro.task08.task0811;

/* 
Побитовые операции
*/

public class Solution {

    public static void main(String[] args) {
        int x = 7;
        System.out.println(Integer.toBinaryString(x));

        x = x & 25;
        System.out.println(Integer.toBinaryString(25));
        x = x & 5;
        System.out.println(Integer.toBinaryString(x));

        x = x & 3;
        System.out.println(Integer.toBinaryString(x));

        x = x & 12;
        System.out.println(Integer.toBinaryString(12));

        x = x | 1;
        System.out.println(x);

        System.out.println();
    }
}
