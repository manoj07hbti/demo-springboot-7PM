package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.modal.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository <Doctor,Long> {

}
