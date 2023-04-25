package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.modal.Student;
import com.example.demospringboot7PM.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public String add(Student student) {


        repository.save(student);

        return "Student added Sucessesfully";

    }

    public List<Student> fatchallstudent() {

        return repository.findAll();
    }

    public String  updateinfo(long id,String name){

    Student student=repository.getById(id);

    student.setName(name);
    repository.save(student);

    return "Student data update Sucessesfully";
    }

    public String removedata(@PathVariable long id){

        repository.deleteById(id);
        return "Student deleted sucessesfully";
    }
    public Student getstudent(long id,String name){
       return repository.findByIdAndName(id, name);

    }

    public List<Student>findStudentByNative(String stream){

        return repository.findStudentsByNativeQuery(stream);
    }






}