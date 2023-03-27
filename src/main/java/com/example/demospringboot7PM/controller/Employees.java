package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.employee.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employees {
    @RequestMapping("/employee")

    public Employee Employee() {
        Employee employee = new Employee("Nadeesh", "Atre", "Admin", 01);

        return employee;
    }

}
