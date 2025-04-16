package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
*/

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
//        Annotation[] annotations = c.getAnnotations();
//        if (annotations.length == 0) {
//            return false;
//        } else
//            for (Annotation annotation : annotations) {
//
//                if (c.isAnnotationPresent(PrepareMyTest.class)) {
//                    annotation
//                }
//
//            }
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest annotation = c.getAnnotation(PrepareMyTest.class);

            for (String s : annotation.fullyQualifiedNames()) {
                System.out.println(s);
            }

            return true;
        } else return false;
    }

    public static <T> boolean printValues(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest annotation = c.getAnnotation(PrepareMyTest.class);

            for (Class<?> aClass : annotation.value()) {
                System.out.println(aClass.getSimpleName());
            }
            return true;
        } else return false;
    }

    // Пытался понять, почему нельзя просто написать:
    // public static boolean printFullyQualifiedNames(Class<T> c) {return true;}
}
