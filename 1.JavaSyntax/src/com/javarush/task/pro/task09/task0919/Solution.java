package com.javarush.task.pro.task09.task0919;

/* 
Разворот строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));


    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();
    }



    public class Point {
        public int x;
        public int y;
        public static final int UNKNOWN = -1;

        public Point(int age, int height) {
            x = age;
            y = height;

        }

        public Point(int age) {
                x = age;
                y = UNKNOWN;
        }
    }
}
