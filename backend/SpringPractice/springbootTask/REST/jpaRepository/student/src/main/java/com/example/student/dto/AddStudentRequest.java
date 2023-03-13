package com.example.student.dto;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;

@Validated
public class AddStudentRequest {
    @Length(min = 2)
    private String name;
    @Min(4)
    private int age;
    @Length(min = 2)
    private String school;
    @Min(1)
    private int standard;

    public AddStudentRequest(String name, int age, String school, int standard) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.standard = standard;
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

