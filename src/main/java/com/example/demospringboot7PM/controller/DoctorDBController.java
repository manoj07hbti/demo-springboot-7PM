package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.modal.Doctor;
import com.example.demospringboot7PM.repository.DoctorRepository;
import com.example.demospringboot7PM.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDBController {

    @Autowired
    DoctorService service;

    @PostMapping("/doctor")
    public String add(@RequestBody Doctor doctor){

        service.add(doctor);
        return "Doctor added Sucessesfull";
    }
    @GetMapping("/doctors")
    public List<Doctor>fatchalldoctors(){
      return service.fatchalldoctor();
    }
    @GetMapping("/doctor/{id}/{specialist}")
    public Doctor getdoctor(@PathVariable long id,@PathVariable String specialist){
        return service.getdoctor(id, specialist);

    }


    @PutMapping("/doctor/{id}/{name}")
    public String updateinfo(@PathVariable long id,@PathVariable String name){

       return service.updateinfo(name, id);

    }
    @DeleteMapping("/doctor/{id}")
    public String removedata(@PathVariable long id){

       return service.removedata(id);
    }



}
