package com.example.demospringboot7PM.student.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Objects;
import javax.persistence.Id;


@Entity(name="Doctor_Table")
public class Doctor_Model {
    @Id //Primary key of the table
    @GeneratedValue //

    long Doc_Id;
    String Fname, Lname, Dept;

    //Constructor for Database
    public Doctor_Model() {
    }

    public Doctor_Model(long doc_Id, String fname, String lname, String dept) {
        Doc_Id = doc_Id;
        Fname = fname;
        Lname = lname;
        Dept = dept;
    }

    public long getDoc_Id() {
        return Doc_Id;
    }

    public void setDoc_Id(long doc_Id) {
        Doc_Id = doc_Id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
