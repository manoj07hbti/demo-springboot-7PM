package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.Model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineerRepository  extends JpaRepository<Engineer,Long> {
}
