package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

import java.util.Arrays;

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.println(multiArray[i][j][k]);
                }
            }
        }

    }

}
class Test {


    int number = method();
    public static void main(String[] args) {

    }

    public static void method2() {
        System.out.println("??");
        main(null);
    }
    {method();}
    public static int method() {
        return 0;
    }
}

