//package org.sqli.authentification.service.Impl;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class ConnectionDb {
//    private static Connection con = null;
//    static
//    {
//        String url = "jdbc:h2:mem:test";
//        String user = "sa";
//        String pass = "";
//        try {
//            con = DriverManager.getConnection(url, user, pass);
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public static Connection getConnection()
//    {
//        return con;
//    }
//
//}
