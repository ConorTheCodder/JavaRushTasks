package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Outer {
    int a = 9;
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
        int b = 1;
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
        static int c = 4;
    }
}
