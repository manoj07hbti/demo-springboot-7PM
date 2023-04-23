package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.DoctorTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<DoctorTest,Long> {

    @Query(value = "select * from DoctorTEST where city=:city",nativeQuery=true)
    List<DoctorTest> findDoctorTestByNativeQuery(String city);
    @Query(value = "select * from DoctorTEST where dept=:dept",nativeQuery=true)
    List<DoctorTest> findDoctorTestByNativedept(String dept);
}
