package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.SQL_Assignment.DoctorOracleTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<DoctorOracleTable, Long> {
}
