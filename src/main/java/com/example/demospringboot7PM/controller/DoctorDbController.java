package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.Service.DoctorService;
import com.example.demospringboot7PM.student.Model.Doctor_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDbController {
    @Autowired
    DoctorService service;

    @PostMapping("/add_doctor")
    public String add(@RequestBody Doctor_Model doctor) {

        return service.add(doctor); // it will save object into database
    }

    @GetMapping("/get_doctor")
    public List<Doctor_Model> getAllDoctors() {

        return service.getAllDoctors();
    }
    @PutMapping("/update_doctor/{id}/{dept}") // End point to update specific record..
    public String updateInfo(@PathVariable long id, @PathVariable String dept){

        return service.updateInfo(id,dept);
    }
    @DeleteMapping("/delete_doctor/{id}") // End point to delete specific record..
    public String remove(@PathVariable long id){

        return service.removeDoctor(id);
    }

    @GetMapping("/get_doctor/{dept}") // End point to fetch records for specific department..
    public List<Doctor_Model> getDoctorByDept(@PathVariable String dept){

        return service.getDoctorByDept(dept);
    }

}
