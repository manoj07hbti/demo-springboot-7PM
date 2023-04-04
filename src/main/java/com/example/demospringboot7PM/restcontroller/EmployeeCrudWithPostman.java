package com.example.demospringboot7PM.restcontroller;

import com.example.demospringboot7PM.modal.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudWithPostman {

    //Employee Management System
    // CRUD : create , read , update , delete with Postman @Annotations

    ArrayList<Employee> employees = new ArrayList<>();

    //RequestBody

    @PostMapping("/add_employee_request")
    public String addEmployeeRequestBody(@RequestBody Employee employee) {

        //creating data of employee


        employees.add(employee);

        return "Employee details added successfully...";
    }

    @PostMapping("/add_employee/{name}/{salary}/{location}")
    public String addEmployee(@PathVariable String name, @PathVariable double salary, @PathVariable String location) {

        //creating data of employee

        Employee employee = new Employee(name, salary, location);
        employees.add(employee);

        return "Employee details added successfully...";
    }

    // read data of employee
    @GetMapping("/get_employee")
    public ArrayList<Employee> getEmployee() {

        return employees;


    }

    // update data of employee
    @PutMapping("/update/{index}/{name}")
    public String updateEmployee(@PathVariable int index, @PathVariable String name) {

        Employee employee = employees.get(index);
        employee.setName(name);
        return "Employee name updated successfully..." + name;

    }

    // deleting data of employee
    @DeleteMapping("/delete_employee/{index}")
    public String delete(@PathVariable int index) {

        employees.remove(index);

        return " Successfully deleted employee data...";

    }


}
