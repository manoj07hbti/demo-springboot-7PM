package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.SQL_Assignment.EngineerTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineerRepository extends JpaRepository<EngineerTable, Long> {
}
