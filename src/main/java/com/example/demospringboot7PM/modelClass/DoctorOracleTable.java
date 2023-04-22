package com.example.demospringboot7PM.modelClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="DoctorTable")// we can change table name DoctorOracleTable to DoctorTable
public class DoctorOracleTable {
    @Id
    @GeneratedValue
    long id;
    String name;
    @Column(name="Hospital")// we can change servicedepartment to Hospital
    String servicedepartment;
    int doctorId;
// we have created default constructor
    public DoctorOracleTable() {
    }
// constructor use of name, servicedepartment, and doctorId
    public DoctorOracleTable(String name, String servicedepartment, int doctorId) {
        this.name = name;
        this.servicedepartment = servicedepartment;
        this.doctorId = doctorId;
    }
// we have done getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServicedepartment() {
        return servicedepartment;
    }

    public void setServicedepartment(String servicedepartment) {
        this.servicedepartment = servicedepartment;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
}
