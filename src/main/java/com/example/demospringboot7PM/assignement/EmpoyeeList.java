package com.example.demospringboot7PM.assignement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class EmpoyeeList {
    @RequestMapping("/Employee")
    public ArrayList<Employee>create(){
        ArrayList<Employee> employee=new ArrayList<>();

        Employee employee1=new Employee("raj", "quality",121);
        Employee employee2=new Employee("gourav", "it",121);
        Employee employee3=new Employee("aman", "marketing",121);
        Employee employee4=new Employee("paramvir", "quality",121);
        Employee employee5=new Employee("salman", "it",121);
        Employee employee6=new Employee("adiba", "quality",121);

        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);
        employee.add(employee5);
        employee.add(employee6);

        return employee;

    }
}
