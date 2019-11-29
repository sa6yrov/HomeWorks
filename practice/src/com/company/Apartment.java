package com.company;

public class Apartment {
    private int quantityOfRooms;
    private int index;
    private double amountSquareMetrs;
    private boolean haveBalcony;
    private Human[] family;

    public Apartment(int quantityOfRooms, int index, double amountSquareMetrs, boolean haveBalcony, Human[] family) {
        this.quantityOfRooms = quantityOfRooms;
        this.index = index;
        this.amountSquareMetrs = amountSquareMetrs;
        this.haveBalcony = haveBalcony;
        this.family = family;
    }
    public int getQuantityOfHumans(){
        int quantity = family.length;
        return quantity;
    }
    public void printInfo(){
        System.out.println("Quantity of Rooms: " + quantityOfRooms + " | Index: " + index + " | Amount of square metrs: "
                + amountSquareMetrs + " | Have Balcony: " + haveBalcony + "\nFamily:");
        for(Human h : family){
            h.printInfo();
        }
    }
    public int getQuantityOfRooms() {
        return quantityOfRooms;
    }

    public void setQuantityOfRooms(int quantityOfRooms) {
        this.quantityOfRooms = quantityOfRooms;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getAmountSquareMetrs() {
        return amountSquareMetrs;
    }

    public void setAmountSquareMetrs(double amountSquareMetrs) {
        this.amountSquareMetrs = amountSquareMetrs;
    }

    public boolean isHaveBalcony() {
        return haveBalcony;
    }

    public void setHaveBalcony(boolean haveBalcony) {
        this.haveBalcony = haveBalcony;
    }

    public Human[] getFamily() {
        return family;
    }

    public void setFamily(Human[] family) {
        this.family = family;
    }
}
