package com.example.demospringboot7PM.controller.Employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeListController {
@RequestMapping("/Employee")

    public  Employee createEmployee(){

        Employee employee = new Employee("Raj",34,"Pune","IT");

        return employee;




    }
}
