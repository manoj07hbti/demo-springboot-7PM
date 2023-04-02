package com.example.demospringboot7PM.requastparam;

import com.example.demospringboot7PM.pathvariable.Employee_Class;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Employee_param {
    ArrayList<Employee_Class> list =new ArrayList();
    @RequestMapping("/Employeelist_param")
    public String Employeelist(@RequestParam String name, @RequestParam String Department, @RequestParam int id){
        Employee_Class employee =new Employee_Class(name, Department, id);
        list.add(employee);

        return "Employee first details: " +name +" "+ Department +" "+ id;

    }
}
