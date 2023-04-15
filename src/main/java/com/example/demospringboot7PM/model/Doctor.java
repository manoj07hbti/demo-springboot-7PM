package com.example.demospringboot7PM.model;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "docId")
    @SequenceGenerator(name = "docId", sequenceName = "docId", initialValue = 1,allocationSize = 1)
    long docId;

    String name;
    String department;

    public Doctor() {
    }

    public Doctor(long docId, String name, String department) {
        this.docId = docId;
        this.name = name;
        this.department = department;
    }

    public long getDocId() {
        return docId;
    }

    public void setDocId(long docId) {
        this.docId = docId;
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
