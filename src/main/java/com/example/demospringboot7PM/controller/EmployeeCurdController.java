package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.controller.Employee.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCurdController {

    ArrayList<Employee> employees = new ArrayList<>();
@RequestMapping("/add_Employee/{name}/{age}/{city}/{dept}")

    public String addEmployee(@PathVariable String name,@PathVariable int age,@PathVariable String city,@PathVariable String dept){

        // create data of Employee

        Employee employee = new Employee(name, age, city, dept);

        employees.add(employee);

        return "Employee details add successfully";
}
@RequestMapping("/get_employee")
    public ArrayList<Employee> getEmployees(){

       return employees;
    }
    @RequestMapping("/Update/{index}/{Name}")
    public String updateEmployee(@PathVariable int index,@PathVariable String name){

        Employee employee =employees.get(index);

        employee.setName(name);

        return " Name Update successfully"+name;

    }
    @RequestMapping("/delete{index}")
    public String delete(@PathVariable int index){

     employees.remove(index);

      return "Successfully delete of employee data";
    }



    }












