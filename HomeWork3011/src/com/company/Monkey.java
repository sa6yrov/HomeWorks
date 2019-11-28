package com.company;


public class Monkey extends ClimbingAnimals implements Climbeable {
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void canHold(Climbeable climbeable){
        System.out.println("I can Hold climbeable animal");
    }
    public void eat(Eatable eatable){
        System.out.println("i eat " + eatable.info());
    }

}

