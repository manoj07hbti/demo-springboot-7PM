package com.example.demospringboot7PM.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Employee_7PM")
public class Employee {

    @Id
    @GeneratedValue
    long id;
    String name;
    int age;
    String department;



    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    public Employee() {
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}