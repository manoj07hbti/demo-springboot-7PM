package com.example.demospringboot7PM.repository;


import com.example.demospringboot7PM.Model.DoctorSystem;
import com.example.demospringboot7PM.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorSysRepository  extends JpaRepository<DoctorSystem,Long>{

    public DoctorSystem findByCityAndDept(String city,String dept);

    public DoctorSystem findByName(String name);



}
