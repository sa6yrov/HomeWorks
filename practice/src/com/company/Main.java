package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("Sabyrov Aidin", 55, "Project manager", "Male");
        Human h2 = new Human("Kasimov Muhtara", 50, "Housewife", "Female");
        Human h3 = new Human("Sabyrov Azik", 20, "Student", "Male");
        Human h4 = new Human("Sabyrova Aidinalui", 17, "Student", " Female");
        Human h5 = new Human("Harokosov Haim", 60, "Driver", "Male");
        Human h6 = new Human("Ruckaya Viktoriya", 55, "SalesWoman", "Female");
        Human h7 = new Human("Harokosov Tamam", 30, "Software enginner", "Male");
        Human h8 = new Human("Harokosova Karima", 27, "Broadcaster", "Female");
        Human[] family1 = {h1, h2, h3, h4};
        Human[] family2 = {h5, h6, h7, h8};
        Apartment ap1 = new Apartment(3, 23, 54, true, family1);
        ap1.printInfo();
        printSeparator();
        Apartment ap2 = new Apartment(4, 45, 101.3, true, family2);
        ap2.printInfo();
        printSeparator();
        Apartment[] apartments = {ap1, ap2};
        ApartmentBuilding apartmentBuilding = new ApartmentBuilding("Chui/Almatinka", 8, 14, apartments);
        apartmentBuilding.printInfo();
        apartmentBuilding.informAboutrepair(true);
        apartmentBuilding.doRepair();
        apartmentBuilding.connectTheHeating();
        System.out.println("Quantity of living people: " + apartmentBuilding.quantityOfHumans());
        printSeparator();
        PrivateHouse privateHouse = new PrivateHouse("Ak-Orgo", 2, 85, family2, true, 10);
        privateHouse.printInfo();
        privateHouse.connectTheHeating();
        System.out.println("Quantity of Living people: " + privateHouse.getQuantityOfHumans());
        printSeparator();
        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter index of apartment in ApartmentBuilding: ");
//        int index = scn.nextInt();
//        searchByIndex(index, apartments);
        System.out.println("Enter any name: ");
        String name = scn.nextLine();
        searchByName(name, apartmentBuilding, privateHouse);

    }
    static void printSeparator() {
        System.out.println("____________________________________________________________________________________________");
    }

    static void searchByIndex(int index, Apartment[] apartments) {
        for (int i = 0; i < apartments.length; i++) {
            if (index == apartments[i].getIndex()) {
                System.out.println("Quantity of people living in this apartment: " + apartments[i].getQuantityOfHumans());
                for (int j = 0; j < apartments[i].getFamily().length; j++) {
                    apartments[i].getFamily()[j].printInfo();
                }
            }
        }
    }

    static void searchByName(String name, ApartmentBuilding apartmentBuilding, PrivateHouse privateHouse) {
        boolean getInfo;
        for (int i = 0; i < apartmentBuilding.getApartments().length; i++) {
            for (int j = 0; j < apartmentBuilding.getApartments()[i].getFamily().length; j++) {
                getInfo = apartmentBuilding.getApartments()[i].getFamily()[j].getFullName().contains(name);
                if (getInfo) {
                    apartmentBuilding.getApartments()[i].getFamily()[j].printInfo();
                    System.out.println("He lives in the house which located on: " + apartmentBuilding.getLocation() +
                            " in: " + apartmentBuilding.getApartments()[i].getIndex() + " apartment");
                }
            }

        }
        for (int i = 0; i < privateHouse.getFamily().length; i++) {
            getInfo = privateHouse.getFamily()[i].getFullName().contains(name);
            if (getInfo) {
                privateHouse.getFamily()[i].printInfo();
                System.out.println("He lives in house which located on: " + privateHouse.getLocation());
            }
        }
    }
}
