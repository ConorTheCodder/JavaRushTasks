package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] table = new int[N][];
        for (int i = 0; i < N; i++) {
            int columnsLength = scanner.nextInt();
            for (int j = 0; j < columnsLength; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
