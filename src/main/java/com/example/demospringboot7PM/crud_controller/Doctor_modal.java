package com.example.demospringboot7PM.crud_controller;

public class Doctor_modal {
    String name;
    String department;
    String workinghospital;
    int salary;

    public Doctor_modal(String name, String department, String workinghospital, int salary) {
        this.name = name;
        this.department = department;
        this.workinghospital = workinghospital;
        this.salary = salary;
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

    public String getWorkinghospital() {
        return workinghospital;
    }

    public void setWorkinhospital(String workinghospital) {
        this.workinghospital = workinghospital;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
