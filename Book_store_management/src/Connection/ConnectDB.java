/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author NGOC THUC
 */
public class ConnectDB {

    public static Connection getConnection() {

    Connection connection = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:1433/QLBS"; // Update with your MySQL server address and database name
        String user = "sa"; // Replace with your MySQL username
        String password = "123456"; // Replace with your MySQL password
        connection = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return connection;
}

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection c = getConnection();
        closeConnection(c);
    }
}
