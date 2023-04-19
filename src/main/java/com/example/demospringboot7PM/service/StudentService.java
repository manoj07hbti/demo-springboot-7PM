package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public String addStudent(Student student){

        repository.save(student);

        return "Student added successfully";
    }

    public List<Student> getAllStudent(){

        return repository.findAll();
    }

    public Student getUsingRoll_no(long rollNo){

        return repository.findByRollNo(rollNo);
    }

    public List<Student> getUsingName(String name){

        return repository.findByName(name);
    }

    public List<Student> getBetweenRollNo(int from , int to){

        return repository.findBetweenRollNo(from,to);
    }

}
