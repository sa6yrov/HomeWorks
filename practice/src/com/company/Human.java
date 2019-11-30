package com.company;

public class Human {
    private String fullName;
    private int age;
    private String proffession;
    private String gender;

    public Human(String fullName, int age, String proffession, String gender) {
        this.fullName = fullName;
        setAge(age);
        this.proffession = proffession;
        this.gender = gender;
    }
    public void printInfo(){
        System.out.println("Full name: " + fullName + " | Age: " + age + " | Profession: " + proffession + " | Gender: " + gender);
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) return;
        else this.age = age;
    }

    public String getProffession() {
        return proffession;
    }

    public void setProffession(String proffession) {
        this.proffession = proffession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
