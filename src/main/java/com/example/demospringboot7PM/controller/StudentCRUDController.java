package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

@RestController
public class StudentCRUDController {

    ArrayList<Student> studentsInfo= new ArrayList<>();
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
    public String  update(@RequestParam int index, @RequestParam String name){

        Student student= studentsInfo.get(index);
        student.setName(name);
//        student.setAge(age);
//        student.setRoll_no(roll);
//        student.setDepartment(department);


        return "Updated Successfully";
    }
    @RequestMapping("/studentsInfo")
    public ArrayList<Student> display(){

        return studentsInfo;
    }
    @RequestMapping("/check")
    public String msg(){
        String res="";
        int c,a=4,b=4;
        c=a+b;

        return res;
    }

}
