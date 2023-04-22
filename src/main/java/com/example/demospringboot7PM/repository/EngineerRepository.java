package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.modelClass.EngineerTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineerRepository extends JpaRepository<EngineerTable, Long> {

}
