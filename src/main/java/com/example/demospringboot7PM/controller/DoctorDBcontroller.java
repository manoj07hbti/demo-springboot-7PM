package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.SQL_Assignment.DoctorOracleTable;
import com.example.demospringboot7PM.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDBcontroller {
    @Autowired
    DoctorService service;
    @PostMapping("/Doctor add")
        public String add(@RequestBody DoctorOracleTable doctor){
        service.add(doctor);
        return "Doctor added successfully";

    }
    @GetMapping("/Doctor read")
    public List<DoctorOracleTable> read(){
        return service.read();
    }
    @PutMapping("/Doctor update/{id}/{doctorId}")
    public String update(@PathVariable long id,@PathVariable int doctorId){

        return service.update(id, doctorId);
    }
    @DeleteMapping("/Doctor delete/{id}")
    public String Doctorremove(@PathVariable long id){
        service.Doctorremove(id);
       return "successfully delete";
    }
}
