package com.example.demospringboot7PM.service;
import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.repsitory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository repository;


    public String add(Employee employee) {
        repository.save(employee);
        return "add service data successfully";
    }

    public List<Employee> getAllEmployeeData() {

        return repository.findAll();
    }

    public String updateEmp(long id, String name) {
        Employee employee = repository.getById(id);
        employee.setName(name);
        repository.save(employee);
     return  "update data successfully";
    }

    public String deleteEmp(long id){
        repository.deleteById(id);
        return  "delete data";
    }
}

