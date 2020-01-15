package com.company;

import Connection.DbConnection;

import java.sql.*;

public class AuthorizeUser {
    private String login;
    private String password;

    public AuthorizeUser(String login, String password) {
        this.login = login;
        this.password = password;
    }
//
//    public void authorize(AuthorizeUser authorizeUser) {
//        if(isHave(authorizeUser.getLogin(), authorizeUser.getPassword()) == true){
//            String SQL = "select id from users where login = ?";
//            try(Connection conn = DbConnection.connect();
//                PreparedStatement pstmt = conn.prepareStatement(SQL)){
//                pstmt.setString(1, authorizeUser.getLogin());
//                try(ResultSet rs = pstmt.executeQuery()){
//                    rs.next();
//                    String sql = "insert into userLogs (user_id, login_time, status) values (?, now(), ?)";
//                    try(PreparedStatement pstmt1 = conn.prepareStatement(sql)){
//                        pstmt1.setInt(1, rs.getInt("id"));
//                        pstmt1.setString(2, Status.OK.toString());
//                        pstmt1.executeUpdate();
//                    }
//                }
//            }catch (SQLException e){
//                System.out.println(e.getMessage());
//            }
//        }else {
//            String SQL = "select id from users where login = ?";
//            try(Connection conn = DbConnection.connect();
//                PreparedStatement pstmt = conn.prepareStatement(SQL)){
//                pstmt.setString(1, authorizeUser.getLogin());
//                try(ResultSet rs = pstmt.executeQuery()){
//                    rs.next();
//                    String sql = "insert into userLogs (user_id, login_time, status) values (?, now(), ?)";
//                    try(PreparedStatement pstmt1 = conn.prepareStatement(sql)){
//                        pstmt1.setInt(1, rs.getInt("id"));
//                        pstmt1.setString(2, Status.FAIL.toString());
//                        pstmt1.executeUpdate();
//                    }
//                }
//            }catch (SQLException e){
//                System.out.println(e.getMessage());
//            }
//        }
//    }
    public void authorize(AuthorizeUser authorizeUser){
        String SQL = "select id from users where login = ?";
        try(Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.setString(1, authorizeUser.getLogin());
            try(ResultSet rs = pstmt.executeQuery()){
                rs.next();
                String sql = "insert into userLogs (user_id, login_time, status) values (?, now(), ?)";
                try(PreparedStatement pstmt1 = conn.prepareStatement(sql)){
                    pstmt1.setInt(1, rs.getInt("id"));
                    pstmt1.setString(2, getStatus(authorizeUser));
                    pstmt1.executeUpdate();
                }
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public String getStatus(AuthorizeUser authorizeUser){
        if(isHave(authorizeUser.getLogin(), authorizeUser.getPassword()) == true) return Status.OK.toString();
        else return Status.FAIL.toString();
    }

    public boolean isHave(String login, String password){
        String SQL = "select count(*) from users where login = ? and password = ? ";
        int count = 0;
        try(Connection conn = DbConnection.connect();
        PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            try(ResultSet rs = pstmt.executeQuery()){
                rs.next();
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(count == 1) return true;
        return false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        String reversePassword = new StringBuffer(password).reverse().toString();
        String encryptionPassword = reversePassword + password.charAt(password.length()-1);
        return encryptionPassword;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
