package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDbController {

    //CRUD
    //C- create or insert

    @Autowired
    StudentRepository repository;

    @PostMapping("/student")
    public String add(@RequestBody Student student){

        repository.save(student);// it will save object into database
        return "Student added successfully ...";
    }

}
