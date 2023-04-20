package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.SQL_Assignment.EmployeeOracleTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeOracleTable, Long> {
}
