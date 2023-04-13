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

    public List<Employee> get(){

        return repository.findAll();
    }

    public String update(long emp_id, String name){

        Employee employee= repository.getById(emp_id);

        employee.setName(name);
        repository.save(employee);

        return "Data successfully updated as name: "+name;

    }

    public String delete(long emp_id){

        repository.deleteById(emp_id);

        return "Record deleted successfully";
    }

    public Employee getUsingSalary(double salary){

        return repository.findBySalary(salary);
    }

    public Employee getUsingEmpId(long empId){

        return repository.findByEmpId(empId);
    }

}
