package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.repository.StudentRepository;
import com.example.demospringboot7PM.modal.Student;
import com.example.demospringboot7PM.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;

    @PostMapping("/student")
    public String add(@RequestBody Student student) {

        service.add(student);
        return "Student added Sucessesfully";
    }

    @GetMapping("/students")
    public List<Student> fatchallstudent() {

        return service.fatchallstudent();
    }

    @GetMapping("/student/{id}/{name}")
    public Student getstudent(@PathVariable long id,@PathVariable String name){

        return service.getstudent(id, name);

}
    @PutMapping("/student/{id}/{name}")
    public String updateinfo(@PathVariable long id,@PathVariable String name){

        return service.updateinfo(id,name);
    }

    @DeleteMapping("/student/{id}")
    public String removedata(@PathVariable long id){

        return service.removedata(id);
    }

    @GetMapping("/nativesql")
    public List<Student>getbyNative(@RequestParam String stream){

       return service.findStudentByNative(stream);
    }
}
