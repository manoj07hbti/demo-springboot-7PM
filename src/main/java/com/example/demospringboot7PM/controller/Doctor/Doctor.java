package com.example.demospringboot7PM.controller.Doctor;

public class Doctor {

    String name;
    int age;
    String city;

    public Doctor(String name, int age, String city) {


        this.name = name;
        this.age = age;
        this.city = city;
    }

    // getter setter


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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void add(Doctor doctor) {
    }
}
