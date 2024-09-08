package com.javarush.task.pro.task04.task0412;

import java.util.Scanner;

/* 
Сумма кратных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        boolean isTrue = start < end;

        int sum = 0;

        for (int i = start; i < end; i++) {
            if (!isTrue) {
                break;
            }
            if (!(i % multiple == 0)) {
                continue;
            } else {
                sum += i;

            }
        }

        System.out.println(sum);
    }
}