package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Amy", 4.3);
        grades.put("Mick", 4.3);
        grades.put("Carter", 4.3);
        grades.put("Lolita", 4.3);
        grades.put("Mack", 4.3);
        grades.keySet();
    }
}
