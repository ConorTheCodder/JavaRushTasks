package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
        System.out.println(octalNumber);
    }

    public static int toOctal(int decimalNumber) {
        int i = 0;
        int octalNumber = 0;
        while (decimalNumber != 0) {
            octalNumber += ((decimalNumber % 8) * (int) Math.pow(10, i));
            decimalNumber /= 8;
            i++;
        }
        if (octalNumber <= 0) {
            return 0;
        } else {

            return octalNumber;
        }
    }

    public static int toDecimal(int octalNumber) {
        int i = 0;
        int decimalNumber = 0;
        while (octalNumber != 0) {
            decimalNumber += (octalNumber % 10) * (int) (Math.pow(8, i));
            octalNumber /= 10;
            i++;
        }
        if (decimalNumber <= 0) {
            return 0;
        } else {
            return decimalNumber;
        }
    }
}
