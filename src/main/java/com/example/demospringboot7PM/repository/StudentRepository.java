package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository <Student,Long>{

    public Student findByIdAndName(Long id, String name);

    public List<Student> findBySection(String section);
}
