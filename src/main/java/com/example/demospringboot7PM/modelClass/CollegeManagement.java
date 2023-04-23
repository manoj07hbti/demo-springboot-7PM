package com.example.demospringboot7PM.modelClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class CollegeManagement {


    @Id
    @GeneratedValue
    long id;
    String collegename;
    String city;
    int numberofstudent;
    String category;

    public CollegeManagement() {
    }

    public CollegeManagement(String collegename, String city, int numberofstudent, String category) {
        this.collegename = collegename;
        this.city = city;
        this.numberofstudent = numberofstudent;
        this.category = category;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberofstudent() {
        return numberofstudent;
    }

    public void setNumberofstudent(int numberofstudent) {
        this.numberofstudent = numberofstudent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
/*College Management System  with CRUD
    College : name, city , number_of_student , type like Inter College or Degree College or Tech College
    */
