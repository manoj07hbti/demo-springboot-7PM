package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.Doc;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    public Doctor findByDocId(long id);

}
