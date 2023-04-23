package com.example.demospringboot7PM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "Engineer_7PM")

public class Engineer {
    @Id
    @GeneratedValue
    Long ID;
    String name;
    int age;
    String salary;

    public Engineer() {
    }

    public Engineer(String name, int age, String salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
