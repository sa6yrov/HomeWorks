package com.company;

public class Main {

    public static void main(String[] args) {
        //Task A
        TrainerDB trainerDB = new TrainerDB();
        trainerDB.show();
        System.out.println("Total Salary: " + trainerDB.getTotalSalary());
        trainerDB.showWithMolodec();
        //Task B
        StudentDB studentDB = new StudentDB();
        System.out.println(studentDB.getStudentsCount() + " students in the group");

        GroupDB groupDB = new GroupDB();
        groupDB.printInfo();
    }
}
