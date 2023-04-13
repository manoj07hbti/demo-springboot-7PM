package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;
    public String add( Student student){

       repository.save(student);
       return "Student added successfully ...";
    }

    public List<Student> fetchALlStudents(){

      return  repository.findAll();// it will fetch all student records
    }

    public String updateInfo(long id, String name){
        //STEP 1 we need to find which record we want to update
         Student student=repository.getById(id); // it will return student object
        // STEP 2 we will update the name and again save to DB
        student.setName(name); // using setter method to change the name.
        repository.save(student);// here we are saving same object again to DB

        return "Data have been updated Successfully ...";
    }

    public String removeStudent(long id){

        repository.deleteById(id);// it will remove this id record

        return "Data deleted Successfully ...";
    }
}
