package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
  public interface DoctorRepository  extends JpaRepository<Doctor,Long> {

     public Doctor findByIdAndCity(long id,String city);

     public Doctor findByCity(String city);

     public Doctor findByNameAndCity(String name,String city);

     public Doctor findByName(String name);
}
