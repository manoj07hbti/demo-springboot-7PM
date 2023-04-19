package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
  public interface DoctorRepository  extends JpaRepository<Doctor,Long> {



}
