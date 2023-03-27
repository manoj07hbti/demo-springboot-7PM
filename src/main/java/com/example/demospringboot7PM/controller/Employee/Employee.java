package com.example.demospringboot7PM.controller.Employee;

public class Employee {
    String name;
    int age;
    String city;
    String Dept;

    public Employee(String name, int age, String city, String dept) {
        this.name = name;
        this.age = age;
        this.city = city;
        Dept = dept;
    }

    // getter setter


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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
