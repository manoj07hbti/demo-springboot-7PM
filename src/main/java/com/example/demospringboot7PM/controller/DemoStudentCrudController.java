package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoStudentCrudController {

    ArrayList<Student> students=new ArrayList<>();

    //C=create
    @RequestMapping("/create/{name}/{age}/{stream}")
    public String createStudent(@PathVariable String name, @PathVariable int age, @PathVariable String stream){

        Student student =new Student(name,age,stream);
        students.add(student);
        return "add student successfully";
    }

    //R= read
    @RequestMapping("/read")
    public ArrayList<Student> readStudent(){

        return students;
    }

    //U = update
    @RequestMapping("/edite/{index}/{name}")
    public String updateStudent(@PathVariable int index,@PathVariable String name){

        Student student=students.get(index);
        student.setName(name);
        return "update student successfully";

    }
    @RequestMapping("/remove/{index}")
    public String deleteStudent(@PathVariable int index){
        students.remove(index);
        return  " delete student successfully";
    }
}
