package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineerRepository extends JpaRepository<Engineer, Long> {

    //public Engineer findByEmpId(long empId);
}
