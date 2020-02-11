package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<City> citiesList = new ArrayList<>();
        List<City> citiesList1 = new ArrayList<>();

        citiesList.add(new City(1, "Bishkek", 1000000));
        citiesList.add(new City(2,"Kara-Balta", 13000));
        citiesList.add(new City(3, "Karakol", 25000));
        citiesList.add(new City(4, "Tokmok", 20000));
        citiesList1.add(new City(1, "Osh", 500000));
        citiesList1.add(new City(5, "Naryn", 200000));
        citiesList1.add(new City(6, "Балыкчи", 10000));
        citiesList1.add(new City(2, "Talas", 13500));

        DbCity dbCity = new DbCity();

//        dbCity.addCitiesToTable(citiesList);
        dbCity.updateCitiesInTable(citiesList1);

    }
}
