package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.employee.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @RequestMapping("/employee/{fname}/{lname}/{dept}/{empId}")

    public String Employee(@PathVariable String fname, @PathVariable String lname, @PathVariable String dept, @PathVariable int empId) {
        //Employee employee = new Employee("Nadeesh", "Atre", "Admin", 01);//

        return "Employee: " + fname + " " + lname + " " + "Dept: " + dept + " Emp_Id: " + empId;
    }
}

