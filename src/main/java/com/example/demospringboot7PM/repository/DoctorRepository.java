package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.DoctorTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<DoctorTest,Long> {
    DoctorTest findByIdAndcity(long id, String city);

    List<DoctorTest> findBydept(String dept);

    List<DoctorTest> findDoctorTestByNativeQuery(String city);
}
