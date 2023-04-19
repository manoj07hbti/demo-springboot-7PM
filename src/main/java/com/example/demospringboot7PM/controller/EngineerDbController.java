package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Engineer;
import com.example.demospringboot7PM.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerDbController {

    @Autowired
    EngineerService engService;

    @PostMapping("/engineer")
    public String addEng(@RequestBody Engineer doc){

        return engService.addEng(doc);
    }

    @GetMapping("/engineer")
    public List<Engineer> getAllEng(){

        return engService.getAllEng();
    }

    @GetMapping("/getEngineerUsingId")
    public Engineer getByEmpId(@RequestParam long empId){
        return engService.getByEmpId(empId);
    }
    @GetMapping("/getUsingSql/{department}")
    public List<Engineer> getUsingEngineerDepartment(@PathVariable String department){
        return engService.getUsingEngineerDepartment(department);
    }
}
