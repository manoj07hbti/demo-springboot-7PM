package com.example.demospringboot7PM.model;

import javax.persistence.*;

@Entity
public class Engineer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Id")
    @SequenceGenerator(name = "Id",sequenceName = "Id",initialValue = 1,allocationSize = 1)
    long Id;

    String name;
    String department;

    public Engineer() {
    }

    public Engineer(long id, String name, String department) {
        Id = id;
        this.name = name;
        this.department = department;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
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
}
