package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    //public List<Student> findByName(String name);

    //Using nativeQuery
    @Query(value = "SELECT * FROM student WHERE student_name =:name",nativeQuery = true)
    public List<Student> findByName(@Param("name") String name);

    public Student findByRollNo(long rollNo);

    @Query(value = "SELECT * FROM student WHERE roll_no BETWEEN :from AND :to",nativeQuery = true)
    public List<Student> findBetweenRollNo(@Param("from") int from , @Param("to") int to);

}
