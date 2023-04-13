package com.example.demospringboot7PM.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Doctor_DB")
public class Doctor {
    @Id// primary key it will be unique
    @GeneratedValue // It will automatically generate id for every record
    long id;

    String name;

    int salary;
    @Column(name="Income")
    String department;

    //create default constructor


    public Doctor() {
    }


// parameterised constructor
    public Doctor(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // creating getter setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
