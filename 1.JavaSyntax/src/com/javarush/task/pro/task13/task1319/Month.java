package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] list = new Month[3];
        list[0] = Month.DECEMBER;
        list[1] = Month.JANUARY;
        list[2] = Month.FEBRUARY;

        return list;

    }
    public static Month[] getSpringMonths(){
        Month[] list = new Month[3];
        list[0] = Month.MARCH;
        list[1] = Month.APRIL;
        list[2] = Month.MAY;

        return list;
    }
    public static Month[] getSummerMonths() {
        Month[] list = new Month[3];
        list[0] = Month.JUNE;
        list[1] = Month.JULY;
        list[2] = Month.AUGUST;

        return list;
    }
    public static Month[] getAutumnMonths() {
        Month[] list = new Month[3];
        list[0] = Month.SEPTEMBER;
        list[1] = Month.OCTOBER;
        list[2] = Month.NOVEMBER;

        return list;
    }

}
