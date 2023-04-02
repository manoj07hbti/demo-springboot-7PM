package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
public class AddStudentController {

    HashSet<Student> studentlist= new HashSet<>();
    boolean check=false;
    @PostMapping("/add_student/{name}/{age}/{roll_no}/{department}")
    public String addStudent(@PathVariable String name,@PathVariable int age,@PathVariable int roll_no,@PathVariable String department){

        Student st1= new Student(name,age,roll_no,department);
        check=true;
        while (true) {
            for (Student var : studentlist) {
                if (var.hashCode() == st1.hashCode()) {
                    check = false;
                    return "Duplicate roll number";
                }
            }
            if (true) {
                studentlist.add(st1);
                return "Added";
            }
        }
    }
    @GetMapping("/students_list")
    public HashSet<Student> getDetails(){

        return studentlist;
    }

}
