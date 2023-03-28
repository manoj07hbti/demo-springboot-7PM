package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> empinfo= new ArrayList<>();

    @RequestMapping(value = "/add_employee",method = RequestMethod.POST)
    public String add(@RequestBody Employee employee){

        empinfo.add(employee);

        return "Employee Added Successfully";
    }

    @RequestMapping(value = "/remove_employee",method = RequestMethod.DELETE)
    public String remove(@RequestParam int index){

        empinfo.remove(index);

        return "Deleted Successfully";
    }

    @RequestMapping(value = "/display_emp",method = RequestMethod.GET)
    public ArrayList display(){

        return empinfo;
    }


}
