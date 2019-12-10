package com.company;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.print("Name: " + name + " | Age: " + age + "     ");
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Animal){
            return ((Animal)obj).name.equals(this.name) &&
                    ((Animal)obj).age == age;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
