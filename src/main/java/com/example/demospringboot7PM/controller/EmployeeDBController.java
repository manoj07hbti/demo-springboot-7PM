package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeDBController {

    @Autowired
    EmployeeService service;

    @PostMapping("/add_data_emp")
    public String add(@RequestBody Employee employee){
         service.add(employee);
         return "add data successfully";
    }

    @GetMapping("/fetch")
    public List<Employee> getAllEmployeeData(){

        return   service.getAllEmployeeData();
    }
    @PutMapping("/put/{id}/{name}")
    public String updateEmployee(@PathVariable long id,@PathVariable String name){
       return service.updateEmp(id,name);

    }
     @DeleteMapping("/delete/{id}")
     public String remove(@PathVariable long id){
       return service.deleteEmp(id);
    }

}
