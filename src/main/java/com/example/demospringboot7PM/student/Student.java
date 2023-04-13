package com.example.demospringboot7PM.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "STUDENT_7pm")
public class Student {

    @Id   // this is primary key and unique
    @GeneratedValue
    long ID;
    String name;
    int age;
    @Column(name = "stream")
    String section;

    // Default constructor
    public Student() {
    }

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
