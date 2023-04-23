package com.example.demospringboot7PM.repository;


import com.example.demospringboot7PM.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
  public interface EmployeeRepository  extends JpaRepository<Employee,Long>{

      public Employee findByIdAndName(long id,String name);


        // Native SQL

     @Query(value = "select * from EMPLOYEE_7pm where city = :city" , nativeQuery=true )

    public List<Employee> nativeQuery(@Param("city") String city);



}
