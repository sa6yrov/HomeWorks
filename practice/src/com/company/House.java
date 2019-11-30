package com.company;

public abstract class House implements HeatingConnectable, Repairable{
    private String location;
    private int quantityOfFloor;
    private int index;

    public House(String location, int quantityOfFloor, int index) {
        this.location = location;
        this.quantityOfFloor = quantityOfFloor;
        this.index = index;
    }

    public abstract void doRepair();

    abstract void printInfo();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getQuantityOfFloor() {
        return quantityOfFloor;
    }

    public void setQuantityOfFloor(int quantityOfFloor) {
        this.quantityOfFloor = quantityOfFloor;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
