package com.example.demospringboot7PM.Service;

import com.example.demospringboot7PM.Model.Employee;
import com.example.demospringboot7PM.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class EmployeeService {
   @Autowired
    EmployeeRepository repository;
    public String add(Employee employee){

        repository.save(employee);


        return "employee added successfully";
    }
      public List<Employee> fetchAllEmployee(){

            return repository.findAll();
      }
      @PutMapping("/")
      public void updateInfo(Long id,String name){

       Employee employee =repository.getById(id);
       employee.setName(name);





      }






}
