package com.company;

import Connection.DbConnection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("muha_pushka007", "muhacc@mail.ru", "123");
        User user2 = new User("erkinder_surprise", "erkin@mail.ru", "123123");
        RegisterUser registerUser = new RegisterUser();
//        registerUser.register(user1);
//        registerUser.register(user2);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String login = scn.nextLine();
        System.out.println("Enter password: ");
        String password = scn.nextLine();
//        AuthorizeUser authorizeUser = new AuthorizeUser(login, password);
        AuthorizeUser authorizeUser1 = new AuthorizeUser(login,password);
//        authorizeUser.authorize(authorizeUser);
        authorizeUser1.authorize(authorizeUser1);
    }
}
