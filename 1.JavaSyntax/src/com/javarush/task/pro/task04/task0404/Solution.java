package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {

        int height = 0;

        while (height < 10) {
            int width = 0;
            while (width < 20) {
                System.out.print("Б");
                width++;
            }
            System.out.println();
            height++;

        }

    }
}