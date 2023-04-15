package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDbController {
    //CRUD
    // Crete or insert
    @Autowired
    EmployeeRepository repository;

    @PostMapping("/employee")
    public String add(@RequestBody Employee employee){
        repository.save(employee);  //it will save object into database
        return "Employee added sucessfully...";
    }
}
