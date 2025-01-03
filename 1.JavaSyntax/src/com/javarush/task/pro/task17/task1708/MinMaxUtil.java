package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int a, int b){return Math.min(a, b);}
    public static int min(int a, int b, int c){return min(c, min(b,c));}
    public static int min(int a, int b, int c, int d){return min(d, min(a, b, c));}
    public static int min(int a, int b, int c, int d, int e){return min(e, min(a, b, c, d));}

    public static int max(int a, int b){return Math.max(a, b);}
    public static int max(int a, int b, int c){return Math.max(a, Math.max(b, c));}
    public static int max(int a, int b, int c, int d){return Math.max(a, Math.max(b, Math.max(c, d)));}
    public static int max(int a, int b, int c, int d, int e){return Math.max(a, Math.max(b, Math.max(c, Math.max(d,e))));}
}
