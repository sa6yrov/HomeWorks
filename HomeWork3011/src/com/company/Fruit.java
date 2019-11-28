package com.company;

public class Fruit implements Eatable {
    private String title;
    private double weight;

    public Fruit(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String info() {
        return "banana";
    }
}
