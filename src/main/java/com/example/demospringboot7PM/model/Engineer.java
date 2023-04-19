package com.example.demospringboot7PM.model;

import javax.persistence.*;

@Entity
public class Engineer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "empId")
    @SequenceGenerator(name = "empId",sequenceName = "empId",initialValue = 1,allocationSize = 1)
    long empId;

    String name;
    String department;

    public Engineer() {
    }

    public Engineer(long empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
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
