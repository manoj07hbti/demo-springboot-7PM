package com.example.demospringboot7PM.controller;

import com.example.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentCrudController {

    ArrayList<Student> data= new ArrayList<>();

    @PostMapping("/add_student")
    public String add(@RequestBody Student student){

        data.add(student);

        return "Added";
    }

    @GetMapping("/getStudent")
    public ArrayList<Student> get(){
        return data;
    }

}
