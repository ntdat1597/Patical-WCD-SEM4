package com.example.da;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/fstore";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";



    public static Connection DBConnection () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Kết nối thành công");
            return connect;
        } catch( Exception e ) {
            System.out.println("Kết nối không thành công");
            if ( e.getMessage().contains("Access denied") ) {
                System.out.println("Username hoặc tài khoản không đúng");
            }
            if ( e.getMessage().contains("Driver") ) {
                System.out.println("Kiểm tra lại driver");
            }

            e.printStackTrace();
            return null;
        }
    }

    public static void main (String[] args) {
        DBConnection();
    }
}
