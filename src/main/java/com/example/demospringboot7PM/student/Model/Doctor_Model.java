package com.example.demospringboot7PM.student.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="Doctor_Table")
public class Doctor_Model {
    @Id //Primary key of the table
    @GeneratedValue //

    long id;
    String Fname, Lname, dept;

    //Constructor for Database

    public Doctor_Model() {
    }

    public Doctor_Model(String dept, String fname, String lname) {
        this.dept = dept;
        this.Fname = fname;
        this.Lname = lname;
    }


    public String getDept() {

        return dept;
    }

    public void setDept(String dept) {

        this.dept = dept;
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
