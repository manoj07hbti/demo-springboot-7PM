package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnListWithRequestParam {
    @RequestMapping("/Employee")
    public String Employee(@RequestParam String name, @RequestParam int age, @RequestParam String department){

        return "Employee name is.."+ name + " Age is..."+ age+ "department " + department;
    }

    @RequestMapping("/student_list")
    public String addStudent(@RequestParam String name,@RequestParam String address, @RequestParam int id){

        return "add student data successfully student name is..."+  name +"   Address...."+address+"   id...."+id;
    }

    @RequestMapping("/doctor")
    public  String doctor(@RequestParam String name, @RequestParam String department, @RequestParam double salary, @RequestParam int id){

        return "doctor details : doctor name is..."+ name +"  department...."+ department + "  salary..."+ salary +"  id  "+id;
    }
}
