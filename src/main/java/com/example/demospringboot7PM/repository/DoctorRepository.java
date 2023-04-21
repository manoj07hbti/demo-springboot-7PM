package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.print.Doc;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    public Doctor findByDocId(long id);

//    @Query(value = "DROP TABLE DOCTOR",nativeQuery = true)
//    public void dropTable();

//    @Query(value = "UPDATE doctor SET name = :name , department= :department  WHERE   id= :id",nativeQuery = true)
//    public Doctor updateNameAndDepartment(@Param("id")long docId,@Param("name") String name,@Param("department") String department);

}
