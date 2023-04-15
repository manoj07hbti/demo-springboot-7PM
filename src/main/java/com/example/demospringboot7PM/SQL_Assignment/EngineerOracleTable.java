package com.example.demospringboot7PM.SQL_Assignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class EngineerOracleTable {
    @Id
    @GeneratedValue
     long id;
    String name;
    int age;
    String Engineerdepartment;

    public EngineerOracleTable() {
    }



    public EngineerOracleTable(String name, int age, String engineerdepartment) {
        this.name = name;
        this.age = age;
        Engineerdepartment = engineerdepartment;
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

    public String getEngineerdepartment() {
        return Engineerdepartment;
    }

    public void setEngineerdepartment(String engineerdepartment) {
        Engineerdepartment = engineerdepartment;
    }
}
