package com.company;

public class Trainer {
    private Integer id;
    private String full_name;
    private String phoneNumber;
    private Integer typeSport;
    private String inn;

    public Trainer(Integer id, String full_name, String phoneNumber, Integer typeSport, String inn) {
        this.id = id;
        this.full_name = full_name;
        this.phoneNumber = phoneNumber;
        this.typeSport = typeSport;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Trainer: " +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", typeSport=" + typeSport +
                ", inn='" + inn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(Integer typeSport) {
        this.typeSport = typeSport;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
