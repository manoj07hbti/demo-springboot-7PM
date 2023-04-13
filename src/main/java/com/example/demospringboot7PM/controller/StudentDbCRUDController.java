package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import com.example.demospringboot7PM.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDbCRUDController {

    @Autowired
    StudentService service;

    @PostMapping("/add_studentDB")
    public String add(@RequestBody Student student) {

        return service.addStudent(student);
    }

    @GetMapping("/get_studentDB")
    public List<Student> get(){

        return service.getAllStudent();
    }

    @GetMapping("/getUsingRoll/{rollNo}")
    public Student getUsingRoll(@PathVariable long rollNo){

        return service.getUsingRoll_no(rollNo);
    }


}