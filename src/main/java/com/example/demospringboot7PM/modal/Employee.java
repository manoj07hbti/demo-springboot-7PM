package com.example.demospringboot7PM.modal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Employee_DataBase")
public class Employee {
   @Id
   @GeneratedValue
  long employeeNo;
    String name;

    double salary;

@Column(name="place")
    String location;

    // default constructor


    public Employee() {
    }

    //parameterised constructor
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
