package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findByName(String name);

    public Student findByRollNo(long rollNo);

}
