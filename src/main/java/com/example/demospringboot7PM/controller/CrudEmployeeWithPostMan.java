package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CrudEmployeeWithPostMan {

    ArrayList<Employee> employees=new ArrayList<>();

    @PostMapping("/create/{name}/{age}/{stream}")
    public String addEmployee(@PathVariable String name, @PathVariable int age, @PathVariable String stream){
        Employee employee=new Employee(name,age,stream);
        employees.add(employee);
        return "employee data is created successfully";
    }
    @GetMapping("/read_employee")

    public ArrayList<Employee> getEmployees(){
        return employees;
    }
    @PutMapping("/update_Employee/{index}/{name}")

    public String updateEmployee(@PathVariable int index, @PathVariable String name){
        Employee employee=employees.get(index);
        employee.setName(name);
        return "update employee successfully";

    }
    @DeleteMapping("/remove_employee/{index}")
    public String deleteEmployee(@PathVariable int index){
        employees.remove(0);
        return "delete employee successfully";
    }
}
