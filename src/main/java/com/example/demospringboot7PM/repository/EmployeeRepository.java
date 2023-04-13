package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Employee findBySalary(double salary);

    public Employee findByDepartment(String department);
    public Employee findByEmpId(long empId);
}
