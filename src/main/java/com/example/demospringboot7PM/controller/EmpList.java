package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import com.example.demospringboot7PM.student.Model.Employee;

@RestController
public class EmpList {
    @RequestMapping("/emp")
    public ArrayList<Employee> emp() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        // Now creating data for Employees
        Employee employee1 = new Employee("Nadeesh", "Atre", "Admin", 01);
        Employee employee2 = new Employee("Nidheesh", "Atre", "IT", 02);
        Employee employee3 = new Employee("Aanchal", "Atre", "HR", 03);
        Employee employee4 = new Employee("Yogesh", "Atre", "OPS", 04);

        //Now adding data to list
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        //Now print the list of employees

        return employeeArrayList;
    }
}
