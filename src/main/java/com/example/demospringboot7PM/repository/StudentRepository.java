package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findByIdAndName(long id,String name);

}

