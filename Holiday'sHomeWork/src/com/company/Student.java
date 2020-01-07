package com.company;

public class Student {
    private Integer id;
    private String name;
    private Integer groupId;

    public Student(Integer id, String name, Integer groupId) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id = " + id +
                " | name = " + name +
                " | groupId = " + groupId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
