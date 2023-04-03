package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {
    ArrayList<String> Employee = new ArrayList<>();

    //Adding Employees to list
    @PostMapping("/add_employee_request/{name}")
    public String add(@PathVariable String name){
        Employee.add(name);
        return name+" :-> Employee name added successfully";
    }
    //Method to get all Employee names which are added to list
    @GetMapping("/get_employees")
    public String getEmployees() { return "List of Employees are: " + Employee;}
    //Update Employee name in the list
    @PutMapping("/update_employees/{index}/{name}")
    public String updateEmployees(@PathVariable int index,@PathVariable String name){
        Employee.set(index,name);
        return ("Employee update as : " +name);
    }
    //Delete Employee from the list
    @DeleteMapping("/delete_employees/{name}")
    public String deleteEmployees(@PathVariable String name){
        Employee.remove(name);
        return (name + " :-> Deleted successfully");
    }
}
