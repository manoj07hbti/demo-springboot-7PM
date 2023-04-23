package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnEmployeeWithPathVeriable {

    @RequestMapping("/Employee/{name}/{age}/{department}")
    public String Employee(@PathVariable String name, @PathVariable int age, @PathVariable String department){

        return "Employee name is.."+ name + " Age is..."+ age+ "department " + department;
    }

    @RequestMapping("/student/{name}/{address}/{id}")
    public String addStudent(@PathVariable String name,@PathVariable String address, @PathVariable int id){

        return "add student data successfully student name is..."+  name +"   Address...."+address+"   id...."+id;
    }

    @RequestMapping("/doctor/{name}/{department}/{salary}/{id}")
    public  String doctor(@PathVariable String name,@PathVariable String department,@PathVariable double salary,@PathVariable int id){

        return "doctor details : doctor name is..."+ name +"  department...."+ department + "  salary..."+ salary +"  id  "+id;
    }
}
