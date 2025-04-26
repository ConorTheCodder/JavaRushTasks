package com.javarush.task.sql.task08.task0805;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Set;

/* 
task0805
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Set<Employee> employees = Set.of(
                new Employee("Vasya", 33, "lead"),
                new Employee("Pasha", 40, "dev"),
                new Employee("Sasha", 40, "lead"),
                new Employee("Dima", 40, "director"),
                new Employee("Sasha", 40, "dev"));
        String sql = "INSERT INTO employee (name, age, smth) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            for (Employee employee : employees) {
                preparedStatement.setString(1, employee.getName());
                preparedStatement.setInt(2, employee.getAge());
                preparedStatement.setString(1, employee.getSmth());
                preparedStatement.addBatch();
            }
                preparedStatement.executeUpdate();
        }
    }
}