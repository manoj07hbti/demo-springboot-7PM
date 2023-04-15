package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Doctor;
import com.example.demospringboot7PM.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
public class DoctorDbController {

    @Autowired
    DoctorService docService;
    @PostMapping("/doctor")
    public String addDoc(@RequestBody Doctor doctor){

        return docService.addDoc(doctor);
    }

    @GetMapping("/doctor")
    public List<Doctor> getAllDoctor(){

        return docService.getAllDoctor();
    }

    @GetMapping("/doctor/{id}")
    public Doctor getUsingId(@PathVariable long id){

        return docService.getUsingDocId(id);
    }

}
