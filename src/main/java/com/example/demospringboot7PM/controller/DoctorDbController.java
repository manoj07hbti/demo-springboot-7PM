package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.Service.DoctorService;
import com.example.demospringboot7PM.student.Model.Doctor_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorDbController {
    @Autowired
    DoctorService service;
    @PostMapping("/add_doctor")
    public String add(@RequestBody Doctor_Model doctor){

        return service.add(doctor); // it will save object into database
 //       return "Doctor added successfully ...";
    }

}
