package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentDbCRUDController {

    @Autowired
    StudentRepository repository;

    @PostMapping("/add_studentDB")
    public String add(@RequestBody Student student) {

        repository.save(student);

        return "Student added successfully";
    }

    @GetMapping("/get_studentDB")
    public List<Student> get(){

        return repository.findAll();
    }


}