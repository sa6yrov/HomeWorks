package com.company;

import java.util.Random;

public class FabricOfHumans {
    String[] fullnames = {"Sabyrov Aidin", "Sabyrova Solazola", "Sabyrov Umar", "Sabyrova Aida",
            "Jeenbekov Almaz", "Jeenbekova Anastasia", "Jeenbekov Raim","Jeenbekova Mariya",
            "Bakiev Bakyt", "Bakieva Vera", "Bakiev Igor", "Bakieva Gulbarchyn"};
    String[] proffesions = {"Project manager", "Housewife", "President","Teacher", "Driver", "Doctor", "Student",
            "Broadcaster","pupil"};
    String[] genders = {"Male", "Female"};
    Human produce(int n, String[]fullnames){
        Random rnd = new Random();
        switch (n){
            case 0: return new Human(fullnames[rnd.nextInt(12)], rnd.nextInt(50), proffesions[rnd.nextInt(9)],genders[rnd.nextInt(2)]);
        }
    }
}
