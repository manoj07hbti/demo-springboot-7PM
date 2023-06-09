package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository <Student,Long>{

    public Student findByIdAndName(Long id, String name);

    public List<Student> findBySection(String section);

    //Native SQL
    @Query(value = "select * from STUDENT_7PM where stream=:stream",nativeQuery=true)
    public List<Student> findStudentsByNativeQuery(@Param("stream") String stream);

}
