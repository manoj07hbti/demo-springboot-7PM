package com.example.demospringboot7PM.restcontroller;

import com.example.demospringboot7PM.modal.Doctor;
import com.example.demospringboot7PM.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorDbController {

    //CRUD

    //C - create or insert
    @Autowired
    DoctorRepository repository;
    @PostMapping("/doctor")
    public String add(@RequestBody Doctor doctor){

        repository.save(doctor); // it will save object into database

        return "Doctor add successfully....";
    }
}
