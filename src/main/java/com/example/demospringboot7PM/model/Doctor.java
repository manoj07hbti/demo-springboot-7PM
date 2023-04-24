package com.example.demospringboot7PM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "doctor_table")
public class Doctor {
    @Id
    @GeneratedValue
    long id;

    public Doctor() {
    }

    public Doctor(String name, int age, String department, String city) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.city = city;

    }

    String name;
    int age;
    String department;
    String city;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity(String city) {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
