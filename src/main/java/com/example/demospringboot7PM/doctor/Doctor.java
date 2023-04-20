package com.example.demospringboot7PM.doctor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="DOCTOR_7PM")
public class Doctor {
    @Id
    @GeneratedValue
    long id;
    String name;
    int age;
    String specialist;
    String hospital;

    public Doctor(String name, int age, String specialist, String hospital) {
        this.name = name;
        this.age = age;
        this.specialist = specialist;
        this.hospital = hospital;
    }

    public Doctor() {
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

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
