package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class StudentHashMapController {

    @RequestMapping("/student_hashcode")
    public HashMap<Integer, Student> studentinfo(){



        HashMap<Integer, Student> students= new HashMap<>();

        Student st1= new Student("Praveen",24,1,"CS");
        Student st2= new Student("Ajeet",5,2,"IT");
        Student st3= new Student("Anurag",25,3,"DBA");
        Student st4= new Student("Anurag",25,3,"DBA");

        students.put(1,st1);
        students.put(2,st2);
        students.put(3,st3);
        students.put(4,st4);

        return students;
    }
}
