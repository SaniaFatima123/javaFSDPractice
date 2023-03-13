package com.example.student.dto;

public class StudentDetails {

    private int id;

    private String name;

    private int age;

    private String school;

    private int standard;

    public StudentDetails(int id, String name, int age, String school, int standard) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.school = school;
        this.standard = standard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}
