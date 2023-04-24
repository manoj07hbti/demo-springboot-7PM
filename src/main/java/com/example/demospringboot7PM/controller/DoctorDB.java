package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Doctor;
import com.example.demospringboot7PM.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDB {
    @Autowired
    DoctorService service;

    @PostMapping("/save")
    public String addDoctor(@RequestBody Doctor doctor){
        service.addDoc(doctor);
        return "add data ";

    }
    @GetMapping("/read")
    public List<Doctor> readDoc(){
        return service.read();
    }
    @PutMapping("/upt/{id}/{city}")
    public String updateDoc(@PathVariable long id,@PathVariable String city){
      return   service.update(id,city);
    }
    @DeleteMapping("/remove/{id}")
    public String remove(@PathVariable long id){
        return service.deleteDoc(id);
    }




    }

