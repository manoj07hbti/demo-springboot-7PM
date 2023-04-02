package com.example.demospringboot7PM.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
public class Employee_variable {
    ArrayList<Employee_Class> Employee= new ArrayList<>();
        @RequestMapping("/Employee_variable/{name}/{Department}/{id}")
        public String AddData(@PathVariable String name,@PathVariable String Department, @PathVariable int id){

            Employee_Class employee= new Employee_Class(name,Department, id);
            Employee.add(employee);


            return "Employee name is : " +name +" "+ "Department is= "+Department +" "+id;
        }


    }

