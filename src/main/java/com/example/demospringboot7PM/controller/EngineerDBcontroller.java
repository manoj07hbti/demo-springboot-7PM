package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.modelClass.EngineerTable;
import com.example.demospringboot7PM.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerDBcontroller {
    @Autowired
    EngineerService service;
    @PostMapping("/Engineer add")
    public String Addengineer(@RequestBody EngineerTable engineer){
        service.Addengineer(engineer);
        return "Engineer data add seccessfully";
    }
    @GetMapping("/Engineer get")
    public List<EngineerTable>get(){
        return service.get();
    }


    @PutMapping("/Engineer update/{id}/{name}")
    public String updateEngineerData(@PathVariable long id, @PathVariable String name){
        service.updateEngineerData(id ,name);
        return "Engineer data update seccessfully";
    }
    @DeleteMapping("/Engineer delete/{id}")
    public String Delete(@PathVariable long id){
        service.Delete(id);
        return "Engineer remove data successfully";
    }

}
