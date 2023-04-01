package com.example.demospringboot7PM.modal;

public class Doctor {

    String name;

    int salary;

    String department;

    //create constructor


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
