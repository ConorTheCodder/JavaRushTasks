package com.javarush.task.jdk13.task34.task3411;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* 
Приватный родитель
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Child child = Child.class.getDeclaredConstructor().newInstance();
        System.out.print(child.getPrivateField());
        setPrivateParentField(child, "privateField", "новая строка");
        System.out.print(child.getPrivateField());
    }

    public static void setPrivateParentField(Object childObject, String fieldName, Object value) throws Exception {
        Field field = childObject.getClass().getSuperclass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(childObject, value);
    }
}
