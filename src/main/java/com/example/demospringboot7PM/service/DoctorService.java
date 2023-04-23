package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.DoctorTest;
import com.example.demospringboot7PM.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository repository;

    public String doctorAdd(DoctorTest doctorTest) {

        repository.save(doctorTest);  // it will save data

        return "doctor added sucessfully..";
    }

    public List<DoctorTest> fetchAllDoctorTest() {

        return repository.findAll();
    }

    public String UpdateDoctor(long id, String name) {

        DoctorTest doctorTest = repository.getById(id);
        doctorTest.setName(name);
        repository.save(doctorTest);    // save again

        return "data updated and saved successfully....";

    }
    public String deleteDoctor( long id ){
            repository.deleteById(id);// it will remove this id record

            return "Data deleted Successfully ...";
        }
    public DoctorTest getDoctorTest(long id , String city){

        return repository.findByIdAndcity(id,city);
    }

    public List<DoctorTest> getDoctorTestBydept(String dept){

        return repository.findBydept(dept);
    }

    public List<DoctorTest> findDoctorTestByNative(String city){

        return repository.findDoctorTestByNativeQuery(city);
    }

    }

