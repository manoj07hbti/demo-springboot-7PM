package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.controller.Employee.Doctor;
import com.example.demospringboot7PM.student.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
  public class DoctorCurdController {

    ArrayList<Doctor> doctors = new ArrayList<>();

    //CURD
   //  C create or add

    @RequestMapping("/add_doctor/{name}/{age}/{city}")

    public String addDoctor(@PathVariable String name,@PathVariable int age,@PathVariable String city){

        Doctor doctor = new Doctor(name, age, city);
         doctors.add(doctor);
         return "Doctor details added successfully";
    }

    @RequestMapping("/get_doctor")

    public ArrayList<Doctor> getDoctors(){

        return doctors;
    }
    @RequestMapping("/update/{index}/{name}")
    public String updateDoctor(@PathVariable int index,@PathVariable String name){
        Doctor doctor =doctors.get(index);
        doctor.setName(name);
        return " Name updated Successfully"+name;
    }
    @RequestMapping("/delete_doctor/{index}")

    public String deleteDoctor(@PathVariable int index){

        doctors.remove(index);

        return "Successfully delete doctor data";





    }













}
