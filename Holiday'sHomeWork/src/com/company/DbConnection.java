package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DbConnection {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "postgres";

    public Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
