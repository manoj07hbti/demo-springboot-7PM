package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.student.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentCRUDController {

    ArrayList<Student>  data= new ArrayList<>();

    @RequestMapping("/add_student")
    public String add(@RequestParam String name,@RequestParam int age,@RequestParam String section){

        Student student= new Student(name,age,section);
        data.add(student);

        return "added";
    }

}
