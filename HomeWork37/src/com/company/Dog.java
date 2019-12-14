package com.company;

import java.util.Objects;

public class Dog {
    String nickName;
    int weight;

    public Dog(String nickName, int weight) {
        this.nickName = nickName;
        this.weight = weight;
    }

    public Dog(){ }
    public void printInfo(){
        System.out.println("Nick name: " + nickName + " | Weight: " + weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return weight == dog.weight &&
                nickName.equals(dog.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, weight);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
