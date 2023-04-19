package com.example.demospringboot7PM.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="ENGINEER_DB")
public class Engineer {
    @Id
     @GeneratedValue
     long id;
    String name;
    int age;

    @Column(name="Section")

    String city;

   // Constructor

    public Engineer() {
    }

    public Engineer(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
