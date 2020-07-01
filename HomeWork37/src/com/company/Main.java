package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Fabric fabricOfDog = new Fabric();
        ArrayList<Dog> list = new ArrayList<>();
        Set<Dog> shelter = new HashSet<>();
        for (int i = 0; i < 40; i++) {
            shelter.add(fabricOfDog.produce());
            list.add(fabricOfDog.produce());
        }
        System.out.println(list.size());
        printSet(shelter);
        System.out.println(shelter.size());
    }
    public static void printSet(Set<Dog> shelter){
        for(Iterator<Dog> it = shelter.iterator(); it.hasNext();){
            it.next().printInfo();
        }
    }
}
