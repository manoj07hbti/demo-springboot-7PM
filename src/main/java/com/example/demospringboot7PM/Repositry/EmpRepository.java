package com.example.demospringboot7PM.Repositry;


import com.example.demospringboot7PM.student.Model.Emp_Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp_Model, Long> {
    // This will fetch employee details for employee id & dept..
    public List<Emp_Model> findByIdAndDept(Long id, String dept);
    // it will fetch all the records of Employees in Ascending order of their salary..
    public List<Emp_Model> findByOrderBySalaryAsc();

}
