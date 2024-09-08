package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedMetersPerSec = scanner.nextInt();
        double speedKM = 3.6;
        int speedKilometersPerHour = (int)Math.round(speedMetersPerSec * speedKM);
        System.out.println(speedKilometersPerHour);
    }
}