package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.Service.EmpService;
import com.example.demospringboot7PM.student.Model.Emp_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpDBController {
    @Autowired
    EmpService service;
    @PostMapping("/add_employee") // End Point to add employee details in the table..
    public String add(@RequestBody Emp_Model employee) {

        return service.add(employee); // it will save employee object into database
    }
    @GetMapping("/get_employee") // End Point to get details of all the employees..
    public List<Emp_Model> getAllEmployees() {

        return service.getAllEmployees();
    }
    @GetMapping("/get_employee/{id}/{dept}") // End point to fetch records for specific Emloyee id & department..
    public List<Emp_Model> getEmployeeByIdAndDept(@PathVariable Long id, @PathVariable String dept){

        return service.getEmployeeByIdAndDept(id, dept);
    }
    @PutMapping("/update_employee/{id}/{dept}/{name}/{salary}") // End point to update specific record..
    public String updateInfo(@PathVariable long id, @PathVariable String dept, @PathVariable String name, @PathVariable int salary){

        return service.updateInfo(id,dept,name,salary);
    }
    @DeleteMapping("/delete_employee/{id}") // End point to delete specific record..
    public String remove(@PathVariable long id){

        return service.removeEmployee(id);
    }

}
