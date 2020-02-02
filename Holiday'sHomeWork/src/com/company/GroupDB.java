package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GroupDB {
    public List<Group> getGroups(){
        String SQL = "select * from groups_2";
        List<Group> groups = new ArrayList<>();
        try(Connection conn = new DbConnection().connect()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                Group group = new Group(
                    rs.getInt("id"),
                    rs.getString("name")
                );
                groups.add(group);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return groups;
    }
    public void printInfo(){
        for (Group g : getGroups()) {
            System.out.println(g);
        }
    }

}
