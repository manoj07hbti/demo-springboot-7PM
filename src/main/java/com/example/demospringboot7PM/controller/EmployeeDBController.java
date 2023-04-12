package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeDBController {

    @Autowired
    EmployeeService service;
    @PostMapping("/add_emp_db")
    public String add(@RequestBody Employee employee){

        return service.add(employee);

    }
}
