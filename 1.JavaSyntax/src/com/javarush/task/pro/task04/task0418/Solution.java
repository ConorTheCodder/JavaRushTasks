package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean isFull = scanner.nextBoolean();
        int glass2;
        if (isFull) {
            glass2 = (int) Math.ceil(glass);
        } else {
            glass2 = (int) Math.floor(glass);
        }
        System.out.println(glass2);
    }
}
