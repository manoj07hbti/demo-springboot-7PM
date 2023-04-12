package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public String add(Employee employee){

        repository.save(employee);

        return "Data added successfully";
    }

}
