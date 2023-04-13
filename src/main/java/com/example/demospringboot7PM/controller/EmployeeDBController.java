package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.Model.Employee;
import com.example.demospringboot7PM.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

  @RestController
public class EmployeeDBController {

      @Autowired

      EmployeeRepository repository;
  @PostMapping("/Emp_DB")
    public String add(@RequestBody Employee employee){

        repository.save(employee);

        return "Employee added Successfully";




    }






}
