package com.example.demospringboot7PM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "employee_table_DB")
public class Employee {
    @Id
    @GeneratedValue()
      long id;
    String name;
    int age;
    String stream;

    public Employee() {
    }

    public Employee(String name, int age, String stream) {
        this.name = name;
        this.age = age;
        this.stream = stream;
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

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
