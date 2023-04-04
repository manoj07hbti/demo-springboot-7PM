package com.example.demospringboot7PM.model;

public class doctor {
    String name;
    int age;
    String specialiazation;

    public doctor(String name, int age, String specialiazation) {
        this.name = name;
        this.age = age;
        this.specialiazation = specialiazation;
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

    public String getSpecialiazation() {
        return specialiazation;
    }

    public void setSpecialiazation(String specialiazation) {
        this.specialiazation = specialiazation;
    }
}
