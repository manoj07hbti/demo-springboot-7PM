package com.example.demospringboot7PM.restcontroller;

import com.example.demospringboot7PM.modal.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {

    //Employee Management System
    // CRUD : create , read , update , delete

    ArrayList<Employee> employees = new ArrayList<>();

    @RequestMapping("/add_employee/{name}/{salary}/{location}")
    public String addEmployee(@PathVariable String name, @PathVariable double salary, @PathVariable String location) {

        //creating data of employee

        Employee employee = new Employee(name, salary, location);
        employees.add(employee);

        return "Employee details added successfully...";
    }

    // read data of employee
    @RequestMapping("/get_employee")
    public ArrayList<Employee> getEmployee() {

        return employees;


    }
    // update data of employee
    @RequestMapping("/update/{index}/{name}")
    public String updateEmployee(@PathVariable int index, @PathVariable String name) {

        Employee employee = employees.get(index);
        employee.setName(name);
        return "Employee name updated successfully..." + name;

    }

    // deleting data of employee
    @RequestMapping("/delete_employee/{index}")
    public String delete(@PathVariable int index) {

        employees.remove(index);

        return " Successfully deleted employee data...";

    }


}
