package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Connection.DbConnection;

public class BlockUsers implements Blocking {
    @Override
    public void blockingUsers(List<UserLogs> userLogsList) {
        for (UserLogs ul : userLogsList) {
            if(checkStatusUsers(ul)){
                String sql = "update users set is_active = ? where id = ?";
                try(Connection conn = DbConnection.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, Status.INACTIVE.toString());
                    pstmt.setInt(2, ul.getUser_id());
                    pstmt.executeUpdate();
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    @Override
    public boolean checkStatusUsers(UserLogs userLogs) {
        String sql = "select count(*) from userLogs where user_id = ? and status = ?";
        int count = 0;
        try(Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, userLogs.getUser_id());
            pstmt.setString(2, Status.FAIL.toString());
            try(ResultSet rs = pstmt.executeQuery()){
                rs.next();
                count = rs.getInt(1);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        if(count >= 3) return true;
        return false;
    }
}
