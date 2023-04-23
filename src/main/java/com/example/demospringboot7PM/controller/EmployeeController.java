package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    @RequestMapping("/employee_data")
    public ArrayList<Employee> employee(){
        ArrayList<Employee>employees=new ArrayList<>();
        Employee employee1=new Employee("Rahul",23,"cs");
        Employee employee2=new Employee("Ramesh",33,"it");
        Employee employee3=new Employee("Raj",32,"cs");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }
}
