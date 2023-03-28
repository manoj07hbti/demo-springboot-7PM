package com.example.demospringboot7PM.restcontroller;

import com.example.demospringboot7PM.modal.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeList {
    @RequestMapping(value = "/Employees")
    public ArrayList<Employee> createEmployee() {

        //creating employee arrayList

        ArrayList<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee("Raju", 5567.77, "Agra");
        Employee employee2 = new Employee("Aman", 7567.77, "Pune");
        Employee employee3 = new Employee("Ramu", 9567.77, "Agra");
        Employee employee4 = new Employee("Sita", 4567.77, "Pune");
        Employee employee5 = new Employee("Annu", 1567.77, "Pune");

        //adding data
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);


        return employees;
    }


}
