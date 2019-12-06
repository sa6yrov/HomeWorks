package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        //Task A
        ArrayList<String> songText = new ArrayList<>();
        ArrayList<String> songText2 = new ArrayList<>();
        songText.add("Ветер с моря дул");
        songText.add("Нагонял беду");
        songText.add("И сказал ты мне");
        songText.add("Больше не приду");

        for (int i = 0; i < songText.size(); i++) {
            if (songText.get(i).length() > 20) {
                songText.set(i, songText.get(i) + " " + songText.get(i));
            }
            else songText2.add(songText.get(i));
        }

        songText2.remove(songText2.indexOf("И сказал ты мне"));
        System.out.println(songText2);

        //Task B
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 50; i++) {
            numbers.add(rnd.nextInt((100 - 1) + 1 + 1));
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (numbers.get(i) % 2 == 0) even.add(numbers.get(i));

            else odd.add(numbers.get(i));
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
