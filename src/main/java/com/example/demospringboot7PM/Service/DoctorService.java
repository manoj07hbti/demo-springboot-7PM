package com.example.demospringboot7PM.Service;

import com.example.demospringboot7PM.Repositry.DoctorRepository;
import com.example.demospringboot7PM.student.Model.Doctor_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository repository;

    public String add(Doctor_Model doctor) {
        repository.save(doctor); // this will add the doctor's record in the table
        return "Doctor Added Successfully";
    }
    public List<Doctor_Model> getAllDoctors(){

        return  repository.findAll();// it will fetch all the records of Doctors
    }
    public String updateInfo(long id, String dept){
        Doctor_Model doctor=repository.getById(id); // Update specific record..
        doctor.setDept(dept);
        repository.save(doctor);
        return "Data updated successfully..!!";
    }
    public String removeDoctor(Long id){
        repository.deleteById(id); // Delete specific record..
        return "Record deleted successfully...!!";
    }

    public List<Doctor_Model> getDoctorByDept(String dept){
        return repository.findByDept(dept);
    }
    /*public List<Student> getStudentBySection(String section){

        return repository.findBySection(section);
    }*/

}
