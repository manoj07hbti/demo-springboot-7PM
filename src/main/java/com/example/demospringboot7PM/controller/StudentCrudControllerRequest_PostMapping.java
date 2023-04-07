package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.student.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentCrudControllerRequest_PostMapping {

    ArrayList<Student> students= new ArrayList<>();

    @PostMapping("/add_student_postmapping")
    public String addStudent(@RequestBody Student student){

        // creating data of student
        students.add(student);

        return "Student details added successfully";
    }

    @GetMapping("/get_students_postmapping")
    public ArrayList<Student>  getStudents(){

        return students;
    }
    @PutMapping("/update_postmapping/{index}/{name}")
    public String updateStudent(@PathVariable int index,@PathVariable String name){

        Student student=students.get(index);
        student.setName(name);
        return "Name updated successfully "+name;
    }

    @DeleteMapping("/delete_student_postmapping/{index}")
    public String delete(@PathVariable int index){

        students.remove(index);

        return "Sucessfuly deleted student data";
    }

}
