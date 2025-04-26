package com.javarush.task.sql.task08.task0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.HashSet;

/* 
task0804
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String sql = "INSERT INTO employee (name, age, smth) VALUES (?, ?, ?)";

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        PreparedStatement ps = connection.prepareStatement(sql);

        for (int i = 1; i < 6; i++) {
            ps.setString(1, "employee_" + (i - 1));
            ps.setInt(2, 29 + i);
            ps.setString(3, "i = " + i);
            ps.addBatch();
        }

        ps.executeBatch();

        connection.close();
        ps.close();

    }
}
