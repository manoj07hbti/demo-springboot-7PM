package com.example.demospringboot7PM.model;

public class Request {

    int index;

    Student student;

    public Request(int index, Student student) {
        this.index = index;
        this.student = student;
    }

    public int getIndex() {
        return index;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
