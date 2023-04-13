package com.example.demospringboot7PM.Service;

import com.example.demospringboot7PM.Model.Employee;
import com.example.demospringboot7PM.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

  @Service
public class EmployeeService {
   @Autowired
    EmployeeRepository repository;
    public String add(Employee employee){

        repository.save(employee);


        return "employee added successfully";
    }






}
