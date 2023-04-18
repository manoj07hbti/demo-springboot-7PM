package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import com.example.demospringboot7PM.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDbController {

    //CRUD
    //C- create or insert

    @Autowired
    StudentService service;

    @PostMapping("/student")
    public String add(@RequestBody Student student){

        service.add(student);// it will save object into database
        return "Student added successfully ...";
    }

    //R- read all the data inside database
    @GetMapping("/students")
    public List<Student> fetchALlStudents(){

      return   service.fetchALlStudents();
    }

    @GetMapping("/student/{id}/{name}")
    public Student getStudent(@PathVariable long id,@PathVariable String name){

        return service.getStudent(id,name);
    }
    @GetMapping("/student/{section}")
    public List<Student> getStudentBySection(@PathVariable String section){

        return service.getStudentBySection(section);
    }

    //U- update
    @PutMapping("/student/{id}/{name}")
    public String updateInfo(@PathVariable long id,@PathVariable String name){

     return service.updateInfo(id,name);
    }

    //D- delete or remove

    @DeleteMapping("/delete/{id}")
    public String remove(@PathVariable long id ){

       return service.removeStudent(id);
    }

    @GetMapping("/nativeSql")
    public List<Student> getStudents(@RequestParam String stream){

        return service.findStudentByNative(stream);
    }
}
