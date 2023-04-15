package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.Doctor;
import com.example.demospringboot7PM.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.print.Doc;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository docRepo;

    public String addDoc(@RequestBody Doctor doctor){

        docRepo.save(doctor);

        return "Doctor added successfully";
    }

    public List<Doctor> getAllDoctor(){

        return docRepo.findAll();
    }

    public Doctor getUsingDocId(long id){

        return docRepo.findByDocId(id);
    }

}
