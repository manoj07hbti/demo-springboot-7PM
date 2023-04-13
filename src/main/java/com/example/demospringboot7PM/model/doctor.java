package com.example.demospringboot7PM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "doctor_7PM")
public class doctor {

    @Id
    @GeneratedValue
    long ID;
    String name;
    int age;
    String specialiazation;

    public doctor() {
    }

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
