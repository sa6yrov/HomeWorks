package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Connection.DbConnection;

public class UserLogs {
    private Integer id;
    private Integer user_id;
    private Date login_time;
    private String status;

    public UserLogs(Integer id, Integer user_id, Date login_time, String status) {
        this.id = id;
        this.user_id = user_id;
        this.login_time = login_time;
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserLogs: " +
                "user_id = " + user_id +
                " | login_time=" + login_time +
                " | status='" + status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public String getStatus() {
        return status.toString();
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
class DbUserLogs{
    public List<UserLogs> getListUserLogs(){
        List<UserLogs> userLogsList = new ArrayList<>();
        String SQL = "select * from userLogs";
        try(Connection conn = DbConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){
            while(rs.next()){
                UserLogs userLogs = new UserLogs(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getDate("login_time"),
                        rs.getString("status")
                );
                userLogsList.add(userLogs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  userLogsList;
    }
    public void showListUserLogs(){
        for (UserLogs ul : getListUserLogs()) {
            System.out.println(ul);
        }
    }
}