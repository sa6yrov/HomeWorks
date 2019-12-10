package com.company;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task B
        LinkedList<Animal> animals = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            if (i < 50) animals.add(new Dog("Dog", i + 1));
            else animals.add(new Cat("Cat", i + 1));
        }
        int counter = 0;
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Cat ){
                counter++;
                if(counter == 5){
                    animals.remove(i);
                    counter = 0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < animals.size() ; i++) {
            if(animals.get(i) instanceof Dog) {
                count++;
                if (count == 3) {
                    animals.add(i + 1, new Mouse("Mouse", i));
                    count = 0;
                }
            }
            animals.get(i).printInfo();
        }

        System.out.println();
        printSeparator();
        System.out.println("Copy elements to the new ArrayList:");
        ArrayList<Animal> animals1 = new ArrayList<>();
        animals1.addAll(0,animals);


        int agesOfCats = 0;
        int agesOfDogs = 0;
        int agesOfMouses = 0;
        LinkedList<Animal> newSortedList = new LinkedList<>();
        for (int i = 0; i < animals1.size(); i++) {
            animals1.get(i).printInfo();
            if(animals1.get(i) instanceof Dog){
                agesOfDogs += animals1.get(i).getAge();
                newSortedList.add(animals1.get(i));
            }
            if(animals1.get(i) instanceof Cat){
                agesOfCats += animals1.get(i).getAge();
                newSortedList.addFirst(animals1.get(i));
            }
        }
        for (int i = 0; i < animals1.size(); i++) {
            if(animals1.get(i) instanceof Mouse) {
                newSortedList.addLast(animals1.get(i));
            }
        }
        System.out.println();
        printSeparator();
        System.out.println("Cats's amount of ages: " + agesOfCats +"\n" +
                "Dogs's amount of ages: " + agesOfDogs + "\n" +
                "Mouses's amount of ages: " + agesOfMouses);
        printSeparator();
        System.out.println("New Sorted List:");
        for (int i = 0; i < newSortedList.size(); i++) {
            newSortedList.get(i).printInfo();
        }
        System.out.println();
        printSeparator();

        //Task A
        ArrayList<Cat> arrayCats = new ArrayList<>();
        LinkedList<Cat> linkedCats = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            arrayCats.add(new Cat("Cat", i+1));
            linkedCats.add(new Cat("Cat", i + 1));
        }

        LocalTime arrayStartTime = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            arrayCats.add(arrayCats.size() / 2, new Cat("newCat", i));
        }
        LocalTime arrayEndTime = LocalTime.now();
        Duration durationArray = Duration.between(arrayStartTime, arrayEndTime);
        System.out.println("Running time (ArrayLIst) when adding 100 objects in the middle: " + durationArray);

        LocalTime linkedStartTime = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            linkedCats.add(linkedCats.size() / 2, new Cat("newCat", i));
        }

        LocalTime linkedEndTime = LocalTime.now();
        Duration durationLinked = Duration.between(linkedStartTime, linkedEndTime);
        System.out.println("Running time (LinkedLIst) when adding 100 objects in the middle: " + durationLinked);
        printSeparator();
        LocalTime arrayStartTime1 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            arrayCats.add(0, new Cat("Cat", i));
        }
        LocalTime arrayEndTime1 = LocalTime.now();
        Duration durationArray1 = Duration.between(arrayStartTime1, arrayEndTime1);
        System.out.println("Running time (ArrayLIst) when adding 100 objects to the top: " + durationArray1);

        LocalTime linkedStartTime1 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            linkedCats.addFirst(new Cat("Cat", i));
        }
        LocalTime linkedEndTime1 = LocalTime.now();
        Duration durationLinked1 = Duration.between(linkedStartTime1, linkedEndTime1);
        System.out.println("Running time (LinkedLIst) when adding 100 objects to the top: " + durationLinked1);
        printSeparator();
        LocalTime arrayStartTime2 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            arrayCats.add(arrayCats.size() / 2, new Cat("Cat", i));
        }
        LocalTime arrayEndTime2 = LocalTime.now();
        Duration durationArray2 = Duration.between(arrayStartTime2, arrayEndTime2);
        System.out.println("Running time (ArrayLIst) when adding 100 objects to the end: " + durationArray2);

        LocalTime linkedStartTime2 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            linkedCats.addLast(new Cat("Cat", i));
        }
        LocalTime linkedEndTime2 = LocalTime.now();
        Duration durationLinked2 = Duration.between(linkedStartTime2, linkedEndTime2);
        System.out.println("Running time (LinkedLIst) when adding 100 objects to the end: " + durationLinked2);
        printSeparator();
        LocalTime arrayStartTime3 = LocalTime.now();
        for (int i = arrayCats.size()/ 2; i < arrayCats.size(); i++) {
            arrayCats.get(i).printInfo();
        }
        LocalTime arrayEndTime3 = LocalTime.now();
        Duration durationArray3 = Duration.between(arrayStartTime3, arrayEndTime3);
        System.out.println();
        System.out.println("Running time (ArrayLIst) when getting  objects from the middle: " + durationArray3);

        LocalTime linkedStartTime3 = LocalTime.now();
        for (int i = arrayCats.size() / 2; i < arrayCats.size(); i++) {
            linkedCats.get(i).printInfo();
        }

        LocalTime linkedEndTime3 = LocalTime.now();
        Duration durationLinked3 = Duration.between(linkedStartTime3, linkedEndTime3);
        System.out.println();
        System.out.println("Running time (LinkedLIst) when getting objects from the middle: " + durationLinked3);
        printSeparator();
        LocalTime arrayStartTime4 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            arrayCats.remove(arrayCats.size() / 2);
        }

        LocalTime arrayEndTime4 = LocalTime.now();
        Duration durationArray4 = Duration.between(arrayStartTime4, arrayEndTime4);
        System.out.println("Running time (ArrayLIst) when removing  objects from the middle: " + durationArray4);

        LocalTime linkedStartTime4 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            linkedCats.remove(arrayCats.size() / 2);
        }
        LocalTime linkedEndTime4 = LocalTime.now();
        Duration durationLinked4 = Duration.between(linkedStartTime4, linkedEndTime4);
        System.out.println("Running time (LinkedLIst) when removing objects from the middle: " + durationLinked4);
        printSeparator();
        LocalTime arrayStartTime5 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            arrayCats.remove(i);
        }
        LocalTime arrayEndTime5 = LocalTime.now();
        Duration durationArray5 = Duration.between(arrayStartTime5, arrayEndTime5);
        System.out.println("Running time (ArrayLIst) when removing  objects from the top: " + durationArray4);

        LocalTime linkedStartTime5 = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            linkedCats.remove(i);
        }
        LocalTime linkedEndTime5 = LocalTime.now();
        Duration durationLinked5 = Duration.between(linkedStartTime5, linkedEndTime5);
        System.out.println("Running time (LinkedLIst) when removing objects from the top: " + durationLinked5);

    }
    private static void printSeparator(){
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}
