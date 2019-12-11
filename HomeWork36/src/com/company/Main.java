package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
	    int[] array = new int[10];
        System.out.println("Array: ");
        for (int i = 0; i < 10; i++) {
            array[i] = rnd.nextInt(2);
            System.out.print(array[i] + "  ");
        }
        System.out.println("\nSorted Array: ");
        sort(array);
        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i, rnd.nextInt(2));
        }
        System.out.println("Array List: \n" + arrayList);
        System.out.println("Sorted Array list: ");
        sort(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i, rnd.nextInt(2));
        }
        System.out.println("Linked List: \n" + linkedList);
        System.out.println("Sorted Linked List: ");
        sort(linkedList);

    }
    private static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.print(array[i] + "  ");
        }
    }

    private static void sort(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size() - 1; j++) {
                if((int)arrayList.get(i) >  (int)arrayList.get(j + 1)){
                    int temp = (int)arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        System.out.println(arrayList);
    }

    private static void sort(LinkedList<Integer> linkedList){
        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = 0; j < linkedList.size() -1; j++) {
                if((int)linkedList.get(j) > (int)linkedList.get(j + 1)){
                    int temp = (int)linkedList.get(j);
                    linkedList.set(j, linkedList.get(j + 1));
                    linkedList.set(j + 1, temp);
                }
            }
        }
        System.out.println(linkedList);
    }
}
