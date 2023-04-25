package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.modal.Doctor;
import com.example.demospringboot7PM.modal.Student;
import com.example.demospringboot7PM.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository repository;

    public String add(Doctor doctor){

        repository.save(doctor);
        return "Doctor added Sucessesfully..";
    }

    public List<Doctor> fatchalldoctor(){
        return repository.findAll();
    }
    public String updateinfo(String name,long id){
        Doctor doctor=repository.getById(id);
        doctor.setName(name);
        repository.save(doctor);
        return "Doctor updated Sucessesfully...";
    }

    public String removedata(@PathVariable long id){

        repository.deleteById(id);
        return "Doctor deleted Sucessesfully...";
    }

    public Doctor getdoctor(long id,String specialist){

      return repository.findByIdAndSpecialist(id, specialist);
    }
    public List<Doctor>findByNativeQuery(String specialist){
        return findByNativeQuery(specialist);
    }





}
