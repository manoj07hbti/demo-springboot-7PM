package com.example.demospringboot7PM.testof28;

import javax.persistence.*;

@Entity
@Table(name = "Book_Management")
public class ModelBook {
    @Id
    @GeneratedValue

    long id;
    @Column(name = "BookName")
    String name;
    int pages;
    @Column(name = "Subject")
    String sub;

    public ModelBook() {
    }

    public ModelBook(String name, int pages, String sub) {
        this.name = name;
        this.pages = pages;
        this.sub = sub;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
}
