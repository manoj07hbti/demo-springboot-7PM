package com.example.demospringboot7PM.controller.Doctor;

import com.example.demospringboot7PM.controller.Doctor.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
  public class DoctorCurdController {

    ArrayList<Doctor> doctors = new ArrayList<>();

    //CURD
   //  C create or add

    @PostMapping("/add_doctor/{name}/{age}/{city}")

    public String addDoctor(@PathVariable String name,@PathVariable int age,@PathVariable String city){

        Doctor doctor = new Doctor(name, age, city);
         doctors.add(doctor);
         return "Doctor details added successfully";
    }

    @GetMapping("/get_doctor")

    public ArrayList<Doctor> getDoctors(){

        return doctors;
    }
    @PutMapping("/update/{index}/{name}")
    public String updateDoctor(@PathVariable int index,@PathVariable String name){
        Doctor doctor =doctors.get(index);
        doctor.setName(name);
        return " Name updated Successfully"+name;
    }
    @DeleteMapping("/delete_doctor/{index}")

    public String deleteDoctor(@PathVariable int index){

        doctors.remove(index);

        return "Successfully delete doctor data";





    }













}
