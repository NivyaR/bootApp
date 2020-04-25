package com.poshley.app.Services;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;

@Service
public class DBConnectService {

    public static Connection mysqlConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nivya", "root", "Nisarga");
        return connection;
    }



}
