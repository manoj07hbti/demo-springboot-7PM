package com.example.demospringboot7PM.Service;

import com.example.demospringboot7PM.Model.Employee;
import com.example.demospringboot7PM.Model.Library;
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


        return "employee added successfully";
    }
      public List<Employee> fetchAllEmployee(){

            return repository.findAll();
      }

      public String updateInfo(Long id,String name){

       Employee employee =repository.getById(id);
       employee.setName(name);
       repository.save(employee);

       return "Date have been update Successfully";

      }

      public String removeEmployee(long id){

        repository.deleteById(id);

        return "  data delete successfully";
      }
      public Employee getEmployee(long id,String name){

        return repository.findByIdAndName(id,name);

      }





}
