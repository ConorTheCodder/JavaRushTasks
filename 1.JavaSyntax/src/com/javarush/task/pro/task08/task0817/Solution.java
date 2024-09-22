package com.javarush.task.pro.task08.task0817;

/* 
Инкременты
*/

public class Solution {

    public static void main(String[] args) {
        int a = 3;
        int num = a;
        int b = ++a + (a-- * ++a);
        int d = ++a + (++a) + (++a);

        System.out.println(b);
        System.out.println(a);
    }
}