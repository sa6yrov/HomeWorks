package com.company;

import java.util.Date;

public class UserLogs {
    private Integer user_id;
    private Date login_time;
    private String status;

    public UserLogs(Integer user_id, Date login_time, String status) {
        this.user_id = user_id;
        this.login_time = login_time;
        this.status = status;
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
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
