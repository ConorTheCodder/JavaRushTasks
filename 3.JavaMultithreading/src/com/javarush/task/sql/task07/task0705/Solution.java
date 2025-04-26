package com.javarush.task.sql.task07.task0705;

import java.sql.*;

/* 
task0705
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet =
                statement.executeQuery("SELECT MIN(age) as minAge FROM employee");
        if(resultSet.next()){
            System.out.println(resultSet.getInt("minAge"));
        }
        connection.close();
        statement.close();
        resultSet.close();

    }
}
