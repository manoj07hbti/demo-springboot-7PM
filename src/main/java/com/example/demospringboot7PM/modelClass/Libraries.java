package com.example.demospringboot7PM.modelClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Libraries {
    @Id
    @GeneratedValue
    long id;
    int availability;
    String titleofbook;
    String author;
    String additions;
    String category;
    public Libraries() {
    }

    public Libraries(int availability, String titleofbook, String author, String additions, String category) {
        this.availability = availability;
        this.titleofbook = titleofbook;
        this.author = author;
        this.additions = additions;
        this.category = category;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getTitleofbook() {
        return titleofbook;
    }

    public void setTitleofbook(String titleofbook) {
        this.titleofbook = titleofbook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAdditions() {
        return additions;
    }

    public void setAdditions(String additions) {
        this.additions = additions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
