package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.Service.DoctorService;
import com.example.demospringboot7PM.Model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDBController {

    @Autowired
    DoctorService service;

    @PostMapping("/Doctor_DB")
    public String add(@RequestBody Doctor doctor) {

        service.add(doctor);

        return "Doctor added Successfully";
    }

    @GetMapping("/doctor")
    public List<Doctor> fetchAllDoctor() {

        return service.fetchAllDoctor();
    }
     @GetMapping("/Doctor/{id}/{city}")
    public Doctor getDoctor(@PathVariable long id,@PathVariable String city){

      return  service.getDoctor(id,city);

    }
    @GetMapping("/doctor/{city}")

    public Doctor getDoctor(@PathVariable String city){

        return service.getDoctorByCity(city);
    }
    @GetMapping("/doctor_get/{name}/{city}")
    public Doctor getDoctor(@PathVariable String name,@PathVariable String city){

        return service.getDoctor(name,city);
    }

        @PutMapping("/update_DB/{id}/{name}")
    public String updateInfo(@PathVariable long id, @PathVariable String name) {

        return service.updateInfo(id, name);

    }

    @DeleteMapping("/delete_doc/{id}")

    public String remove(@PathVariable long id) {

        return service.removeDoctor(id);
    }

}












