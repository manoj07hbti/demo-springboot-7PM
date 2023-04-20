package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.modal.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {
    ArrayList<Employee> employees = new ArrayList<>();

    @PostMapping("/employee_request")
    public String addemployeerequest(@RequestBody Employee employee) {
        employees.add(employee);
        return "employee detail  added sucessesfull";
    }

    @PostMapping("/add_employee/{name}/{age}/{department}")
    public String employees(@PathVariable String name, @PathVariable int age, @PathVariable String department) {
        Employee employee = new Employee(name, age, department);
        employees.add(employee);
        return "employee detail added sucssesfull";
    }

    @GetMapping("/get_employee")
    public ArrayList<Employee> get_employee() {
        return employees;
    }
    @PutMapping("/update/{index}/{name}")
    public String update_data(@PathVariable int index, @PathVariable String name) {

        Employee employee =employees.get(index);
        employee.setName(name);
        return "name update sucessesfully"+name;
    }
@DeleteMapping("/delete/{index}")
    public String delete(@PathVariable int index){
        employees.remove(index);
        return "employee remove sucessesfull";

    }
}