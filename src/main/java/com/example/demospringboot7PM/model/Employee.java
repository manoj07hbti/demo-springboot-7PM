package com.example.demospringboot7PM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Employee_Table") // it will change the class name
public class Employee {
    @Column(name="Emp_name")  //its will change the name of colum
    String name;
    @Id  //primary key and it will be unique
    @GeneratedValue   // it will automatically generate id for every record
    int Empcode;
    int salary;

    //default constructor

    public Employee() {
    }

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
