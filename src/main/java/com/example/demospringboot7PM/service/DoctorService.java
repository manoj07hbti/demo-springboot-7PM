package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.Doctor;
import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.repsitory.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository repository;

    public String addDoc(Doctor doctor){
        repository.save(doctor);
   return "add data successfully";
    }

    public List<Doctor>read(){
        return repository.findAll();
    }

    public String update(long id,String city){
        Doctor doctor=repository.getReferenceById(id);
        doctor.setCity(city);
        repository.save(doctor);
        return "update city successfully";
    }

    public String deleteDoc(long id){
        repository.deleteById(id);
        return "delete data successfully";
    }

    }

