package com.company;

public class PrivateHouse extends House{
    private Human[] family;
    private boolean haveGarden;
    private double amountOfHundredth;

    public PrivateHouse(String location, int quantityOfFloor, int index, Human[] family, boolean haveGarden, double amountOfHundredth) {
        super(location, quantityOfFloor, index);
        this.family = family;
        this.haveGarden = haveGarden;
        this.amountOfHundredth = amountOfHundredth;
    }
    public int getQuantityOfHumans(){
        int quantity = family.length;
        return quantity;
    }
    @Override
    public void connectTheHeating() {
        System.out.println("Heating is started");
    }

    @Override
    public void doRepair() {
        System.out.println("Repair has started");
    }

    @Override
    public void printInfo(){
        System.out.println("Locatin: " + getLocation() + " | Quantity of Floor: " + getQuantityOfFloor() + " | Index: " + getIndex()
                + " | Have Garden: " + haveGarden + " | Amount of Hundredth: " + amountOfHundredth + "\nFamily:");
        for (Human h: family) {
            h.printInfo();
        }
    }
    public Human[] getFamily() {
        return family;
    }

    public void setFamily(Human[] family) {
        this.family = family;
    }

    public boolean isHaveGarden() {
        return haveGarden;
    }

    public void setHaveGarden(boolean haveGarden) {
        this.haveGarden = haveGarden;
    }

    public double getAmountOfHundredth() {
        return amountOfHundredth;
    }

    public void setAmountOfHundredth(double amountOfHundredth) {
        this.amountOfHundredth = amountOfHundredth;
    }
}
