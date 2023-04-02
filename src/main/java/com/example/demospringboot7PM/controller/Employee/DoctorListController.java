package com.example.demospringboot7PM.controller.Employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorListController {

    @RequestMapping("/Doctor")
    public Doctor createDoctor(){

        Doctor doctor = new Doctor("Rajeev",38,"Agra");

        return doctor;

    }
    public ArrayList<Doctor> getDoctor(){

        ArrayList<Doctor> doc = new ArrayList<>();

        Doctor doctor1 = new Doctor("Kamini",32,"Pune");;
        Doctor doctor2 = new Doctor("Raj",38,"Kanpur");
        Doctor doctor3 = new Doctor("Rahul",45,"Mumbai");

        // add data of doctor

        doc.add(doctor1);
        doc.add(doctor2);
        doc.add(doctor3);

           return doc;





    }













}
