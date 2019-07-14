package database;

import java.sql.*;

public class db {
    static void dbset() throws SQLException,ClassNotFoundException{
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/d1";
        String username = "root";
        String password = "774249120zhu";

        Connection conn = DriverManager.getConnection(url,username,password);

        Statement st = conn.createStatement();

    }
}
