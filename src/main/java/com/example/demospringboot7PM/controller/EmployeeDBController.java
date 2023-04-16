package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.Model.Employee;
import com.example.demospringboot7PM.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBController {

      @Autowired
      EmployeeService service;

  @PostMapping("/Employee_DB")
    public String add(@RequestBody Employee employee){

        service.add(employee);

        return "Employee added Successfully";

    }
    @GetMapping("/Employees_DB")

    public List<Employee> fetchAllEmployee(){

        return  service.fetchAllEmployee();

    }
    @PutMapping("/Employee/{Id}/{name}")
    public void updateInfo(@PathVariable Long Id,@PathVariable String name){




    }






}
