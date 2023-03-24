package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AllStudentInfoController {
    @RequestMapping("/studentinfo")
    public ArrayList<Student> studentinfo(){

        ArrayList<Student> students= new ArrayList<>();

        Student st1= new Student("Praveen",24,1,"CS");
        Student st2= new Student("Ajeet",5,2,"IT");
        Student st3= new Student("Anurag",25,3,"DBA");

        students.add(st1);
        students.add(st2);
        students.add(st3);

        return students;
    }

}
