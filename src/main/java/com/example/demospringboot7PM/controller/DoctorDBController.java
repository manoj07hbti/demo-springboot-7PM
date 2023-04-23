package com.example.demospringboot7PM.controller;


import com.example.demospringboot7PM.model.DoctorTest;

import com.example.demospringboot7PM.service.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDBController {

    @Autowired
    DoctorService service;
    @PostMapping("/doctorAdd")
    public String doctorAdd(@RequestBody DoctorTest doctorTest){

        service.doctorAdd(doctorTest);  // it will save data

        return "doctor added sucessfully..";
    }

    // R- read data from the database

    @GetMapping("/fetchAllDoctorTest")
    public List<DoctorTest> fetchAllDoctorTest(){

        return service.fetchAllDoctorTest();
    }

    // U- update

    @PutMapping("/UpdateDoctor/{id}/{name}")
    public String  UpdateDoctor(@PathVariable long id,  @PathVariable String name){

        return service.UpdateDoctor(id , name);

    }
    //D- delete or remove

    @DeleteMapping("/deleteDoctor/{id}")
    public String deleteDoctor(@PathVariable long id ){

        return service.deleteDoctor(id);
    }

    @GetMapping("/nativeSql")
    public List<DoctorTest> getDoctorTest(@RequestParam String city){

        return service.findDoctorTestByNative(city);
    }
}
