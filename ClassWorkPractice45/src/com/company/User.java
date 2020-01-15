package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
    private String login;
    private String email;
    private String password;

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
