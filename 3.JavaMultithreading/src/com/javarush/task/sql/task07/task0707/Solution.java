package com.javarush.task.sql.task07.task0707;

import java.sql.*;

/* 
Метод wasNull
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name, weight FROM employee");
        while (resultSet.next()) {
            Double weight = resultSet.getDouble(2);
            if (resultSet.wasNull()){
                weight = null;
            }
            String name = resultSet.getString(1);
            System.out.println(name + " " + weight);
        }

        connection.close();
        statement.close();

    }
}
