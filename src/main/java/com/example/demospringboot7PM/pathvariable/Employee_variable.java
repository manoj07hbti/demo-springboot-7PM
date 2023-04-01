package com.example.demospringboot7PM.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
public class Employee_variable {


        @RequestMapping("/Employee_variable/{name}/{Department}/{id}")
        public String AddData(@PathVariable String name,@PathVariable String Department, @PathVariable int id){
            ArrayList Employee= new ArrayList<>();

            Employee.add(name);
            Employee.add(Department);
            Employee.add(id);


            return "Employee name is : " +name +" "+ "Department is= "+Department +" "+id;
        }


    }

