package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.SQL_Assignment.EmployeeOracleTable;
import com.example.demospringboot7PM.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBcontroller {
    @Autowired
    EmployeeService service;
    @PostMapping("/Employee add")
    public String AddEmployee(@RequestBody EmployeeOracleTable employee){
        service.AddEmployee(employee);
          return "Employee Data successfully Added";
    }


    @GetMapping("/Employee read")
    public List<EmployeeOracleTable> get(){
       return service.get();
    }
    @PutMapping("/Employee update/{id}/{department}")
    public String updateEmployee(@PathVariable long id, @PathVariable String department){
        service.updateEmployee(id, department);
        return "successfully update";
    }
    @DeleteMapping("/Employee delete/{id}")
    public String Delete(@PathVariable long id){
        service.Delete(id);

        return "Successfully remove employee data";
    }
}
