package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> empinfo= new ArrayList<>();

    @RequestMapping("/add_employee")
    public String add(@RequestBody Employee employee){

        empinfo.add(employee);

        return "Employee Added Successfully";
    }

    @RequestMapping("/display_emp")
    public ArrayList display(){

        return empinfo;
    }


}
