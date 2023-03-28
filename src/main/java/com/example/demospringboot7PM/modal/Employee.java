package com.example.demospringboot7PM.modal;

public class Employee {

    String name;

    double salary;

    String location;

    //constructor

    public Employee(String name, double salary, String location) {
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    //getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
