package com.example.demospringboot7PM.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="BOOK_TABLE")
public class Book {

    @Id
    @GeneratedValue
    long id;
    String name;
    int page;
    String writer_name;
    String subject;

    public Book() {
    }

    public Book(String name, int page, String writer_name, String subject) {
        this.name = name;
        this.page = page;
        this.writer_name = writer_name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getWriter_name() {
        return writer_name;
    }

    public void setWriter_name(String writer_name) {
        this.writer_name = writer_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
