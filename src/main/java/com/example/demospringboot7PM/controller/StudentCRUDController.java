package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

@RestController
public class StudentCRUDController {

    HashSet<Student> studentsInfo= new HashSet<>();
    @RequestMapping("/add_students")
    public Student create(@RequestBody Student student){

        studentsInfo.add(student);

        return student;

    }
    @RequestMapping("/remove_student")
    public Student remove(@RequestBody Student student){

        studentsInfo.remove(student);

        return student;
    }
    @RequestMapping("/update_student")
    public Student update(@RequestBody Student student){

        studentsInfo.remove(student);
        studentsInfo.add(student);

        return student;
    }
    @RequestMapping("/studentsInfo")
    public HashSet display(){
        return studentsInfo;
    }

}
