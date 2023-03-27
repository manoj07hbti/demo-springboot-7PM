package com.example.demospringboot7PM.assignement;

public class Employee {
    String name;
    String department;
    int id;

    public Employee(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
