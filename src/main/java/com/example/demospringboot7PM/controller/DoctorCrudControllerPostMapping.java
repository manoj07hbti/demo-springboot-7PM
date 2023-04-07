package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DoctorCrudControllerPostMapping {
    ArrayList<doctor> doctors= new ArrayList<>();

    @PostMapping("/addDoctors_requestMapping")
    public String addDoctors_requestMapping(@RequestBody doctor doctor){

        doctors.add(doctor);

        return "doctor added successfully";
    }

    @GetMapping("/getDoctors_requestMapping")
    public ArrayList<doctor> getDoctors_requestMapping(){
        return doctors;
    }

    @PutMapping("/updateDoctors_requestMapping/{index}/{name}")
    public String updateDoctors_requestMapping(@PathVariable int index, @PathVariable String name){
        doctor doctor = doctors.get(index);
        doctor.setName(name);

        return "doctor name updated successfully : " +name;
    }

    @DeleteMapping("/deleteDoctors_requestMapping")
    public String deleteDoctors_requestMapping(@RequestParam int index){

        doctors.remove(index);

        return "doctor deleted successfully : at index " +index;
    }

}
