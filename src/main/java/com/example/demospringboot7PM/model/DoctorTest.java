package com.example.demospringboot7PM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "DoctorTEST")
public class DoctorTest {

    @Id
    @GeneratedValue
            Long ID;

    String name;
    int age;
    String dept;
    String city;

    public DoctorTest(String name, int age, String dept, String city) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.city = city;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public DoctorTest() {
    }
}
