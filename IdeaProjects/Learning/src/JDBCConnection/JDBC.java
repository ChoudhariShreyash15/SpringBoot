package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/MyDB";
        String user = "root";
        String password = "sarasu10";

        // try-with-resources automatically closes Connection and Statement
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(100), " +
                    "salary DOUBLE)";

            stmt.executeUpdate(sql);
            System.out.println("Table created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}