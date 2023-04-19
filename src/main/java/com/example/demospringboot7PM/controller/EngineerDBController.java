package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.Model.Engineer;
import com.example.demospringboot7PM.Service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerDBController {

    @Autowired
    EngineerService service;
    @PostMapping("/Engineer_DB")
    public String add(@RequestBody Engineer engineer){

        service.add(engineer);

        return "Engineer add Successfully";

    }
    @GetMapping("/Engineer")
    public List<Engineer> fetchAllEngineer(){

       return service.fetchAllEngineer();

    }
    @PutMapping("/Engineer/{id}/{name}")
    public String updateInfo(@PathVariable long id,@PathVariable String name){

        return service.updateInfo(id,name);

    }
    @DeleteMapping("/remove/{id}")
    public String remove(@PathVariable long id){

        return service.removeEngineer(id);



    }












}
