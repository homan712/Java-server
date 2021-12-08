package School.CityTech.CST3613.loadxml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection(){
        String dbURL = "jdbc:derby://localhost:1527/homan/data/realEstate2021;create=false;user=realEstate;password=pwd1234";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(dbURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        var connection = getConnection();
        System.out.println("connection = " + connection);
    }
}
