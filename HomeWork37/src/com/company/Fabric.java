package com.company;

import java.util.Random;

public class Fabric {
    public Dog produce() {
        Random rnd = new Random();
        int maxAge = 20, minAge = 1;
        String[] names = {"Alik", "Nolik", "Bobik", "Krolik", "Dolik", "Folik", "Buba", "Huba", "Beiba", "Shenok", "Laika",
                "Garik", "Pes", "Jora", "Kola", "Filip", "Baskov", "Shakal", "Repik", "Python", "Torik", "Runik", "Rubik"
                , "Malysh", "Tokeshi", "Gaizu", "Gori", "Yamaha", "Henry", "Messi", "Bmwka", "Kulik", "Sharik", "Yumi",
                "Werold", "Hatamichi", "Toyhacu", "Gerald", "Teromi", "Excepka"};

        return new Dog(names[rnd.nextInt(40)], minAge + rnd.nextInt((maxAge-minAge) + 1));
    }
}

