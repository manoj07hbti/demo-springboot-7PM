package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCRUDController {

    ArrayList<Employee> empData= new ArrayList<>();
    @PostMapping("/addEmp")
    public String add(@RequestBody Employee employee){

        empData.add(employee);

        return "Employee added successfully";

    }

    @GetMapping("/getEmp")
    public ArrayList<Employee> getData(){

        return empData;
    }

    @PutMapping("/updateEmp")
    public String update(@RequestParam int index, @RequestParam String name){

        Employee newName= empData.get(index);
        newName.setName(name);

        return "Data updated successfully";
    }

    @DeleteMapping("/deleteEmp")
    public String delete(@RequestBody Integer index){

        int Index= index;
        empData.remove(Index);

        return "Data deleted updated successfully";
    }

}
