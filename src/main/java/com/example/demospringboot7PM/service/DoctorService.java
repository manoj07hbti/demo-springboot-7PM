package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.Doctor;
import com.example.demospringboot7PM.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

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

//    public String dropTable(){
//
//        docRepo.dropTable();
//
//        return "table deleted";
//    }


    public String updateDepartment(long id,String department){

        Doctor doctor=docRepo.findByDocId(id);

        doctor.setDepartment(department);

        docRepo.save(doctor);

        return "Department updated successfully as: "+department;

    }

//    public String updateNameDepartment(long docId, String name,String department){
//
//        docRepo.updateNameAndDepartment(docId,name,department);
//
//        return "Department updated successfully Name as: "+name+" and Department as:"+department;
//    }

}
