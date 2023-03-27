package com.example.demospringboot7PM.controller.Employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeListController {
@RequestMapping("/Employee")

    public  Employee createEmployee(){

        Employee employee = new Employee("Raj",34,"Pune","IT");

        return employee;


    }
    @RequestMapping("/Emp")

    public ArrayList<Employee> getEmployee(){

         ArrayList<Employee> Emp = new ArrayList<>();

         Employee emp1 = new Employee("Mohit",32,"Agra","IT");
         Employee emp2 = new Employee("Rahul",30,"Mumbai","CS");
         Employee emp3 = new Employee("Shekhar",42,"Pune","IT");
         Employee emp4 = new Employee("Seeta",28,"Tudla","Engineer");

         Emp.add(emp1);
         Emp.add(emp2);
         Emp.add(emp3);
         Emp.add(emp4);

         return Emp;




    }


}
