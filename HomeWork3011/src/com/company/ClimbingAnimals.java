package com.company;


public abstract class ClimbingAnimals implements Climbeable{
    private String name;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String type) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) return;
        else this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ClimbingAnimals(String name, int age, double weight) {
        this.name = name;
        setAge(age);
        this.weight = weight;

    }

    @Override
    public void climbing() {
        System.out.println("I climbing");
    }
}
