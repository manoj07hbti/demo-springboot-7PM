package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentCrudController {

    ArrayList<Student> students= new ArrayList<>();

    @PostMapping("/add_student/{name}/{age}/{section}")
    public String addStudent(@PathVariable String name , @PathVariable int age, @PathVariable String section){

        // creating data of student
        Student student= new Student(name,age,section);
        students.add(student);

        return "Student details added successfully";
    }

    @GetMapping("/get_students")
    public ArrayList<Student>  getStudents(){

        return students;
    }
    @PutMapping("/update/{index}/{name}")
    public String updateStudent(@PathVariable int index,@PathVariable String name){

        Student student=students.get(index);
        student.setName(name);
        return "Name updated successfully "+name;
    }

    @DeleteMapping("/delete_student/{index}")
    public String delete(@PathVariable int index){

        students.remove(index);

        return "Sucessfuly deleted student data";
    }

}
