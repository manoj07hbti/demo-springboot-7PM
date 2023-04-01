package com.example.demospringboot7PM.requastparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Employee_param {
    @RequestMapping("/Employeelist_param")
    public String Employeelist(@RequestParam String name, @RequestParam String Department, @RequestParam int id){
        ArrayList list =new ArrayList();
        list.add(name);
        list.add(Department);
        list.add(id);

        return "Employee first details:  " +name + Department + id;

    }
}
