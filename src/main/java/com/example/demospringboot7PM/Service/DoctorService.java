package com.example.demospringboot7PM.Service;

import com.example.demospringboot7PM.Repositry.DoctorRepository;
import com.example.demospringboot7PM.student.Model.Doctor_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctorService {
    @Autowired
    DoctorRepository repository;

    public String add(Doctor_Model doctor) {
        repository.save(doctor);
        return "Doctor Added Successfully";
    }
}
