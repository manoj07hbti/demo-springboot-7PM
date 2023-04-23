package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorController {

    ArrayList<Doctor> doctors=new ArrayList<>();
    @RequestMapping("/add/{name}/{age}/{department}/{city}")
    public String create(@PathVariable String name, @PathVariable int age, @PathVariable String department, @PathVariable String city){
        Doctor doctor=new Doctor(name,age,department,city);
        doctors.add(doctor);
        return "add data seccessfully";

    }
    @RequestMapping("/get_doctor_data")
    public ArrayList<Doctor> get(Doctor doctor){

        return doctors;
    }

    public  String updateDoctorDetails(@PathVariable int index,@PathVariable String name){
        Doctor doctor =doctors.get(index);
        doctor.setName(name);
        return "update data successfully";

    }
    @RequestMapping("/delete")
    public String remove(@RequestParam int index){

        doctors.remove(index);
        return "delete data successfully";

    }


}
