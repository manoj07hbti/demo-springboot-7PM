package com.example.demospringboot7PM.student.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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

    public Doctor_Model(String dept, String fname, String lname) {
        this.Dept = dept;
        this.Fname = fname;
        this.Lname = lname;
    }


    public String getDept() {

        return Dept;
    }

    public void setDept(String dept) {

        this.Dept = dept;
    }
    public String getFname() {

        return Fname;
    }

    public void setFname(String fname) {

        this.Fname = fname;
    }

    public String getLname() {

        return Lname;
    }

    public void setLname(String lname) {

        this.Lname = lname;
    }


}
