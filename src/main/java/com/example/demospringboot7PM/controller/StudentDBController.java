package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDBController {

    @Autowired
    StudentRepository repository;
    @PostMapping("/student")
    public String add(@RequestBody Student student){

        repository.save(student);  // it will save data

        return "Student added sucessfully..";
    }
}
