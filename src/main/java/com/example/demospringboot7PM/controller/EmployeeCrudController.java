package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {
    ArrayList<Employee> employees=new ArrayList<>();




  /*  @RequestMapping("/add_employee/{name}/{Empcode}/{salary}")
    public String addemployee(@PathVariable String name ,@PathVariable int Empcode ,@PathVariable  int salary){
        //creating data of employee
        Employee employee=new Employee(name,Empcode,salary);
        employees.add(employee);
        return "Employee details addes sucessfully " ;


    */}
    @RequestMapping("/get_employee")
    public ArrayList<Employee> getEmployees(){
        return employees;
    }
    @RequestMapping("/update/{index}/{name}")
    public String updateEmployee(@PathVariable int  index ,@PathVariable String name){
        Employee employee=employees.get(index);
        employee.setName(name);
        return "Updated sucessfully" +name;
    }
    @RequestMapping("/delete_employee/{index}")
    public String delete(@PathVariable int index){
        employees.remove(index);
        return "delete data sucessfully";
    }
}
