package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

@RestController
public class AddStudentController {

    HashSet<Student> studentlist= new HashSet<>();
    boolean check=false;
    @RequestMapping("/add_student/{name}/{age}/{roll_no}/{department}")
    public String addStudent(@PathVariable String name,@PathVariable int age,@PathVariable int roll_no,@PathVariable String department){

        Student st1= new Student(name,age,roll_no,department);
        check=true;
        while (true) {
            for (Student var : studentlist) {
                if (var.hashCode() == st1.hashCode()) {
                    check = false;
                    return "Duplicate";
                }
            }
            if (true) {
                studentlist.add(st1);
                return "Added";
            }
        }
    }
    @RequestMapping("/students_list")
    public HashSet<Student> getDetails(){

        return studentlist;
    }

}
