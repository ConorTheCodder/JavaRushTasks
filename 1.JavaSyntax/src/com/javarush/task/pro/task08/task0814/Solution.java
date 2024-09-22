package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {

        int flag = 0;
        flag = number | (1 << flagPos);
        return flag;
    }

    public static int resetFlag(int number, int flagPos) {
        int flag = 0;
        flag = number & ~(1 << flagPos);
        return flag;
    }

    public static boolean checkFlag(int number, int flagPos) {
        int flag = 0;
        if ((number & (1 << flagPos)) == (1 << flagPos)) {
            return true;
        } else {
            return false;
        }
    }
}
