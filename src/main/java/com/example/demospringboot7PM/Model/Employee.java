package com.example.demospringboot7PM.Model;

import javax.persistence.*;

@Entity(name="EMPLOYEE_7pm")
public class Employee {
      @Id  //primary key it will unique
     @GeneratedValue
      long id;
    String name;
    int age;
    String city;
    @Column(name="getSalary")
    String dept;

    // default constructor
    public Employee() {
    }

    public Employee(String name, int age, String city, String dept) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.dept = dept;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
