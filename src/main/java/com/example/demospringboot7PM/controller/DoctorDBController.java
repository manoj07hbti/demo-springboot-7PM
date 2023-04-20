package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.modal.Doctor;
import com.example.demospringboot7PM.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorDBController {

    @Autowired
    DoctorRepository repository;
    @PostMapping("/doctor")
    public String add(@RequestBody Doctor doctor){

        repository.save(doctor);
        return "Doctor added Sucessesfull";
    }
}
