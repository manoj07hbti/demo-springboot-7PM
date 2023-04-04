package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {

    ArrayList<Employee> employees = new ArrayList<>();

    @RequestMapping("/addemployee/{name}/{id}/{department}/{salary}")
    public String addemployyee(@PathVariable  String name, @PathVariable int id, @PathVariable String department,@PathVariable int salary){
        Employee employee =new Employee(name, id, department, salary);
        employees.add(employee);
        return "employee added successfully : " +name;
    }

    @RequestMapping("/getEmployees")
    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    @RequestMapping("/updateEmployee/{index}/{name}")
    public String updateEmployee(@PathVariable int index, @PathVariable String name){
        Employee employee = employees.get(2);
        employee.setName(name);
        return "Name updated successfully : " +name;
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam int index){
        employees.remove(index);
        return "employee deleted successfully";
    }

}
