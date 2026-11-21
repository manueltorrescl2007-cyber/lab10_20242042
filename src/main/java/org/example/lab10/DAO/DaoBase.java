package org.example.lab10.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public abstract class DaoBase {
    public Connection getConection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new SQLException("Falta el conector MySQL.", ex);
        }
        String url = "jdbc:mysql://localhost:3306/lab10_iweb";
        return DriverManager.getConnection(url, "admin", "12345678");

    }
}
