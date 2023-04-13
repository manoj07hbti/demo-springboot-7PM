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
    @PostMapping("/add_emp_db")
    public String add(@RequestBody Employee employee){

        return service.add(employee);

    }

    @GetMapping("/get_emp_db")
    public List<Employee> get(){

        return service.get();
    }

    @PutMapping("/update_emp_db/{emp_id}/{name}")
    public String update(@PathVariable Integer emp_id,@PathVariable String name){

        return service.update(emp_id,name);
    }

    @DeleteMapping("/delete_emp_db/{emp_id}")
    public String delete(@PathVariable Integer emp_id){

        return service.delete(emp_id);

    }

    @GetMapping("/using_emp_id")
    public Employee getUsingEmp_id(@RequestParam Double salary){

        return service.getUsingSalary(salary);
    }
}
