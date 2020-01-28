package com.company;

import Connection.DbConnection;

import java.sql.*;
import java.util.List;

public class AuthorizeUser {
    private String login;
    private String password;

    public AuthorizeUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void authorize(AuthorizeUser authorizeUser) {
        if (getUserByLogin(authorizeUser.getLogin()).getIs_active().equals(Status.INACTIVE.toString())) {
            System.out.println("Hello, " + getLogin() + ", authorization was not  successfully! " +
                    "Your account was banned");
        }
        if(!getUserByLogin(authorizeUser.getLogin()).getPassword().equals(authorizeUser.getPassword())) {
            System.out.println("Your password is incorrect");
        }
        if(getUserByLogin(authorizeUser.getLogin()) == null) System.out.println("Your login or password is incorrect");

        if(getUserByLogin(authorizeUser.getLogin()).getIs_active().equals(Status.ACTIVE.toString())){
            insertAuthorizeUser(authorizeUser);
            System.out.println("Hello, " + getLogin() + ", authorization was successfully");
        }
    }

    public void insertAuthorizeUser(AuthorizeUser authorizeUser) {
            String sql = "insert into userLogs (user_id, login_time, status) values (?, now(), ?)";
            try (Connection conn = DbConnection.connect();
                 PreparedStatement pstmt1 = conn.prepareStatement(sql)) {
                pstmt1.setInt(1, getUserByLogin(authorizeUser.getLogin()).getId());
                pstmt1.setString(2, getStatus(authorizeUser));
                pstmt1.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    public User getUserByLogin(String login){
        String SQL = "select * from users where login = ?";
        User user = null;
        try(Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.setString(1,login);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    user = new User(
                            rs.getInt("id"),
                            rs.getString("login"),
                            rs.getString("email"),
                            rs.getString("password"),
                            rs.getDate("date_of_registration"),
                            rs.getString("is_active")
                    );
                    return user;
                }
                return null;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String getStatus(AuthorizeUser authorizeUser) {
        if (isHave(authorizeUser.getLogin(), authorizeUser.getPassword()) == true) return Status.OK.toString();
        else return Status.FAIL.toString();
    }

    public boolean isHave(String login, String password) {
        String SQL = "select count(*) from users where login = ? and password = ? ";
        int count = 0;
        try (Connection conn = DbConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                rs.next();
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (count == 1) return true;
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
        String encryptionPassword = reversePassword + password.charAt(password.length() - 1);
        return encryptionPassword;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
