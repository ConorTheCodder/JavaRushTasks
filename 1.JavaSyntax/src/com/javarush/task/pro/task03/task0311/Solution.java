package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {

        double treshold = 0.000001;

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (Math.abs(num1 - num2) < treshold) {
            System.out.println("числа равны");
        }
        if (Math.abs(num1 - num2) > treshold) {

            System.out.println("числа не равны");
        }
    }
}
