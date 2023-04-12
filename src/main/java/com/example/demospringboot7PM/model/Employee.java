package com.example.demospringboot7PM.model;

public class Employee {
    String name;
    int Empcode;
    int salary;

    public Employee(String name, int empcode, int salary) {
        this.name = name;
        Empcode = empcode;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpcode() {
        return Empcode;
    }

    public void setEmpcode(int empcode) {
        Empcode = empcode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
