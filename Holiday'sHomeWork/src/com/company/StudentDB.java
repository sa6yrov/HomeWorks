package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {
    public int getStudentsCount(){
        String SQL = "select count (*) from students_2";
        int count = 0;
        try(Connection conn = new DbConnection().connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            count = rs.getInt(1);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return count;
    }
}
