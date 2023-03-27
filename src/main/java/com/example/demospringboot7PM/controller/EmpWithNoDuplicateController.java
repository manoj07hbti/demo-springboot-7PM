package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.HashSet;

@RestController
public class EmpWithNoDuplicateController {

    HashSet<Employee> empData= new HashSet<>();
    boolean check=false;
    @RequestMapping("/add_emp")
    public String add(@RequestBody Employee employee){



        check=true;
        while (true){
            for (Employee var : empData){
                if (employee.hashCode()==var.hashCode()){
                    check =false;
                    return "Duplicate Employee ID";
                }
            }
            if (true){
                empData.add(employee);
                return "Data Added Successfully";
            }
        }
    }

    @RequestMapping("/remove_emp")
    public String remove(@RequestBody Employee employee){

        empData.remove(employee);

        return "Deleted Successfully";
    }
    @RequestMapping("/emp_list")
    public HashSet<Employee> display(){

        return empData;
    }

}
