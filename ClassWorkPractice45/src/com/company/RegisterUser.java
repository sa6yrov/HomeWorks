package com.company;


import Connection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterUser {
    public void register(User user){
        String SQL = "insert into users (login, email, password, date_of_registration) values (?, ?, ?, now())";

        try(Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL))
        {
            pstmt.setString(1, user.getLogin());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
