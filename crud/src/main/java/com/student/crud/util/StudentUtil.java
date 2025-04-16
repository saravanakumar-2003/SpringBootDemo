package com.student.crud.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class StudentUtil {

    public Connection connection() throws ClassNotFoundException, SQLException {
        Connection conn;
        String url = "jdbc:mysql://localhost:3306/student_project";
        String user = "root";
        String password = "Sharu@1229";



        //Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establish connection
        conn = DriverManager.getConnection(url,user,password);
        System.out.println("Connected to MySQL database");
        return conn;
    }
}
