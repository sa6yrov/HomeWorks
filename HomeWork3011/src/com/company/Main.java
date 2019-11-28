package com.company;



public class Main {

    public static void main(String[] args) {
        Monkey monkey = new Monkey("Monkey", 13 , 60.3);
        Koala koala = new Koala("Koala", 4, 13.5);
        monkey.canHold(koala);
        Fruit banana = new Fruit("banana", 0.23);
        monkey.eat(banana);
    }
}
