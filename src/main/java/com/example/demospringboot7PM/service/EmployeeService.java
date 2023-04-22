package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.modelClass.EmployeeOracleTable;
import com.example.demospringboot7PM.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    public String AddEmployee(EmployeeOracleTable employee){
        repository.save(employee);

        return "Employee Data successfully Added";
    }
    public List<EmployeeOracleTable> get(){
        return repository.findAll();
    }
    public String updateEmployee(long id, String department){
        EmployeeOracleTable employee=repository.getById(id);
        employee.setDepartment(department);
        repository.save(employee);
        return "successfully update";
    }
    public String Delete( long id){
        repository.deleteById(id);

        return "Successfully remove employee data";
    }

}
