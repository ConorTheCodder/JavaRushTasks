package com.javarush.task.sql.task08.task0802;

import java.sql.*;

/* 
Откат транзакции
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            statement.executeUpdate("UPDATE employee SET salary = salary + 2000 WHERE name = 'Diego'");
            statement.executeUpdate("UPDATE employee SET salary = salary + 500 WHERE name = 'Amigo'");

            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
        } finally {
            connection.close();
            statement.close();
        }
    }
}
