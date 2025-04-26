package com.javarush.task.sql.task08.task0803;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/* 
task0803
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String name = "Harry";
        int age = 18;
        String smth = "Senior pomidor";
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        PreparedStatement ps =  connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(1, age);
        ps.setString(1, smth);

        ps.executeUpdate();

        connection.close();
        ps.close();

    }
}
