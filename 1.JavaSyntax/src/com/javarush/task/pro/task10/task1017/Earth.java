package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        Antarctica antarctica = new Antarctica(4343);
        Australia australia = new Australia(3480);
        Eurasia eurasia = new Eurasia(3849094);
        NorthAmerica northAmerica = new NorthAmerica(3473984);
        SouthAmerica southAmerica = new SouthAmerica(3478);
        Africa africa = new Africa(3478473);
    }
}
