package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < MULTIPLICATION_TABLE[0].length; i++) {
            MULTIPLICATION_TABLE[i][0] = i + 1;
            System.out.print(MULTIPLICATION_TABLE[i][0] + " ");

            for (int j = 1; j < MULTIPLICATION_TABLE[j - 1].length; j++) {
                MULTIPLICATION_TABLE[i][j] = MULTIPLICATION_TABLE[i][0] * (j + 1);
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");

            }
            System.out.println();
        }
    }
}
