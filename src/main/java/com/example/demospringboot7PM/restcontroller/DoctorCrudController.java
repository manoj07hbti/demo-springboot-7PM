package com.example.demospringboot7PM.restcontroller;

import com.example.demospringboot7PM.modal.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorCrudController {

    //Doctor Management System
    // CRUD : create , read , update , delete

    ArrayList<Doctor> doctors = new ArrayList<>();

    //creating data of doctor

    @RequestMapping("/add_doctor/{name}/{salary}/{department}")
    public String createDoctor(@PathVariable String name, @PathVariable int salary, @PathVariable String department) {
        Doctor doctor = new Doctor(name, salary, department);
        doctors.add(doctor);

        return "Doctor details added successfully...";
    }

    // reading data of doctor
    @RequestMapping("/get_doctor")
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    // updating data of doctor
    @RequestMapping("/update_doctor/{index}/{name}")
    public String updateDoctor(@PathVariable int index, @PathVariable String name) {
        Doctor doctor = doctors.get(index);
        doctor.setName(name);

        return "Doctor name updated successfully..." + name;

    }
    // deleting data of doctor

    @RequestMapping("/delete_doctor/{index}")
    public String deleteDoctor(@PathVariable int index) {

        doctors.remove(index);
        return "Successfully deleted doctor data...";

    }
}
