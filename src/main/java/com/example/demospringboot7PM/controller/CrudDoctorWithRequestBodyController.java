package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CrudDoctorWithRequestBodyController {

    ArrayList<Doctor> doctors=new ArrayList<>();
    @PostMapping("/add_doctor")
    public String addDoctor(@RequestBody Doctor doctor){
        doctors.add(doctor);
        return  "add doctor data successfully";
    }


    @GetMapping("/read_doctor")
    public ArrayList<Doctor> getDoctor(){
        return doctors;
    }
    @PutMapping("/update_doctor/{name}/{index}")
    public String updateDoctor(@PathVariable String name,@PathVariable int index){
        Doctor doctor=doctors.get(index);
        doctor.setName(name);
        return "update doctor data successfully";
    }
    @DeleteMapping("/delete_data")

    public String deleteDoctor(@RequestParam int index){
        doctors.remove(index);
        return "delete index successfully";
    }
}
