package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.doctor;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorCrudController {
    ArrayList<doctor> doctors= new ArrayList<>();

    @RequestMapping("/addDoctors/{name}/{age}/{spec}")
    public String addDoctors(@PathVariable String name, @PathVariable int age, @PathVariable String spec){
        doctor doctor = new doctor(name, age, spec);
        doctors.add(doctor);

        return "doctor added successfully" + name;
    }

    @RequestMapping("/getDoctors")
    public ArrayList<doctor> getDoctors(){
        return doctors;
    }

    @RequestMapping("/updateDoctors/{index}/{name}")
    public String updateDoctors(@PathVariable int index, @PathVariable String name){
        doctor doctor = doctors.get(index);
        doctor.setName(name);

        return "doctor name updated successfully : " +name;
    }

    @RequestMapping("/deleteDoctors")
    public String deleteDoctors(@RequestParam int index){

        doctors.remove(index);

        return "doctor deleted successfully : at index " +index;
    }




}
