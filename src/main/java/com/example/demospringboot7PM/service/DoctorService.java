package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.SQL_Assignment.DoctorOracleTable;
import com.example.demospringboot7PM.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository repository;

    public String add(DoctorOracleTable doctor) {
        repository.save(doctor);
        return "service added successfully";
    }

    public List<DoctorOracleTable> read() {
        return repository.findAll(); //it will fetch all doctor record
    }
     public String update(long id,int doctorId){
      DoctorOracleTable doctor=repository.getById(id);
      doctor.setDoctorId(doctorId);
      repository.save(doctor);
      return "update doctor data successfully";
    }
    public String Doctorremove(long id){
        repository.deleteById(id);
        return "data delete successfully";
    }

}
