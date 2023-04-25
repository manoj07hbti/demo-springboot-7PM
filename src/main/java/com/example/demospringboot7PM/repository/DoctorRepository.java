package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.modal.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepository extends JpaRepository <Doctor,Long> {

    public Doctor findByIdAndSpecialist(long id,String specialist);

    @Query(value = "select * from DOCTOR_7PM  specialist=:specialist",nativeQuery = true)
    public List<Doctor>findByNativeQuery(@Param("specialist")String specialist);
}
