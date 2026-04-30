package org.example.JDBCConn;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/MyDB";
        String user = "root";
        String password = "sarasu10";

        // try-with-resources automatically closes Connection and Statement
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

//            String sql = "CREATE TABLE IF NOT EXISTS employee (" +
//                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
//                    "name VARCHAR(100), " +
//                    "salary DOUBLE)";

            String sql = "select * from employees";

            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getDouble("salary"));
            }
            System.out.println("Table Extracted Successfully");

//            stmt.executeUpdate(sql);
//            System.out.println("Table created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}