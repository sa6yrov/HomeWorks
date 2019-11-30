package com.company;


public class ApartmentBuilding extends House {
    private Apartment[] apartments;

    public ApartmentBuilding(String location, int quantityOfFloor, int index, Apartment[] apartments) {
        super(location, quantityOfFloor, index);
        this.apartments = apartments;
    }

    public int quantityOfHumans(){
        int quantity = 0;
        for(Apartment ap : apartments){
            quantity += ap.getQuantityOfHumans();
        }
        return quantity;
    }
    @Override
    public void connectTheHeating() {
        System.out.println("Heating is connected");
    }
    public void informAboutrepair(boolean notify){
        if(notify == true) System.out.println("Neighbors has notified about repair, u can start repair!");
        else System.out.println("Repair can not be started");
    }
    @Override
    public void doRepair() {
        System.out.println("Repair has started");
    }

    @Override
    public void printInfo(){
        System.out.println("Locatin: " + getLocation() + " | Quantity of Floor: " + getQuantityOfFloor() + " | Index: " + getIndex() + "\nApartments:");
        for(Apartment a : apartments){
            a.printInfo();
        }
    }
    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

}
