package com.example.demospringboot7PM.modelClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeOracleTable {
    @Id // primary key it will be unique
    @GeneratedValue // it will automatically generate id for every record
            // we can change column name then use column id
    long id;
    String name;
    int age;
    String department;

    public EmployeeOracleTable() {
    }

    public EmployeeOracleTable(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
