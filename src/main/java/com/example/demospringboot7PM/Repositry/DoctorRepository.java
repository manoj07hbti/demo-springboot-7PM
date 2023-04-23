package com.example.demospringboot7PM.Repositry;

import com.example.demospringboot7PM.student.Model.Doctor_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;*/
import java.util.*;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor_Model, Long> {

    public List<Doctor_Model> findByDept(String dept);
//    public List<Student> findBySection(String section);



}
