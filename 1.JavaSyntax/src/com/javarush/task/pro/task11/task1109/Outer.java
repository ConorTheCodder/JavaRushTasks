package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

import java.util.HashMap;

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }

    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }

    }
}

