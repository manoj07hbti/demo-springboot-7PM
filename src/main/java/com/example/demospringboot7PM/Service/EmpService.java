package com.example.demospringboot7PM.Service;


import com.example.demospringboot7PM.Repositry.EmpRepository;
import com.example.demospringboot7PM.student.Model.Emp_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepository repository;
    public String add(Emp_Model doctor) {
        repository.save(doctor); // this will add the employee record in the table
        return "Employee Added Successfully..!!";
    }
    // List all the employees alongwith their details..
    public List<Emp_Model> getAllEmployees(){
        // it will fetch all the records of Employees in Ascending order of their salary..

        return repository.findByOrderBySalaryAsc();
    }
    // Get employee details based on Employee Id & Dept..
    public List<Emp_Model> getEmployeeByIdAndDept(Long id, String dept){
        return repository.findByIdAndDept(id, dept);
    }
    // Update Employee Name, Dept, Salary for the selected employee id..
    public String updateInfo(long id, String dept, String name, int salary){
        Emp_Model employee=repository.getById(id); // Update specific record..
        employee.setDept(dept); // Dept, Employee name, Salary can be updated..
        employee.setName(name);
        employee.setSalary(salary);
        repository.save(employee);
        return "Data updated successfully..!!";
    }
    // Delete employee for the selected employee id...
    public String removeEmployee(Long id){
        repository.deleteById(id); // Delete specific record..
        return "Record deleted successfully...!!";
    }


}
