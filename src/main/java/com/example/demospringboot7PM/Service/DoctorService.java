package com.example.demospringboot7PM.Service;
import com.example.demospringboot7PM.Model.Doctor;
import com.example.demospringboot7PM.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository repository;
    public String add(Doctor doctor){
        repository.save(doctor);

        return "data added Successfully";
    }
    public List<Doctor>fetchAllDoctor(){

        return repository.findAll();
    }
    public String updateInfo(long id,String name){

     Doctor doctor= repository.getById(id);
      doctor.setName(name);
      repository.save(doctor);

      return "Data have been update successfully";
    }
    public String removeDoctor(long id){

        repository.deleteById(id);

        return "delete data successfully";
    }










}
