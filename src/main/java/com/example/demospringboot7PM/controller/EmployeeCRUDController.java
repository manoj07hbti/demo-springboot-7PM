package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.Model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCRUDController {

    ArrayList<Employee> empData= new ArrayList<>();

    @PostMapping("/addEmp")
    public String add(@RequestBody Employee employee){
        empData.add(employee);

        return "Done";

    }
    @GetMapping("/getEmp")
    public ArrayList<Employee> getEmp(){

        return empData;

    }
    @PutMapping("/updateEmp")
    public String update(@RequestParam int index,@RequestParam String name){

       Employee employee= empData.get(index);
       employee.setName(name);

       return " update data successfully";

    }
    @DeleteMapping("/delete_Emp")
    public String delete(@RequestBody Integer index ){

        int Index = index;

        empData.remove(Index);

        return "delete data successfully";
    }



}
