package com.javarush.task.sql.task07.task0709;

import java.sql.*;
import java.time.LocalDateTime;

/* 
Метод getObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name, weight, birthday, inn FROM employee");

        while (resultSet.next()){
            String name = resultSet.getString("name");
            float weight = resultSet.getFloat("weight");
            Date birthday = resultSet.getDate("birthday");
            long inn = resultSet.getLong("inn");

            System.out.println(name + " " + weight + " " + birthday + " " + inn);
        }

        connection.close();
        statement.close();

    }
}
