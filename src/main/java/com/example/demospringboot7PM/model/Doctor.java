package com.example.demospringboot7PM.model;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {

    String name;
    @Id
    @GeneratedValue
    long doc_id;
    String department;

    public Doctor() {
    }

    public Doctor(String name, long doc_id, String department) {
        this.name = name;
        this.doc_id = doc_id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(long doc_id) {
        this.doc_id = doc_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
