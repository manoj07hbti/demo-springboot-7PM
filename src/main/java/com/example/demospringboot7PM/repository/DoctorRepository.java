package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.SQL_Assignment.DoctorOracleTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<DoctorOracleTable, Long> {
    public DoctorOracleTable findByName(String name);
    public DoctorOracleTable findByDoctorId(int doctorId);
    public DoctorOracleTable findByIdAndName(Long id, String name);
    public List<DoctorOracleTable> findByservicedepartment(String servicedepartment);
    public List<DoctorOracleTable> findByIdAndServicedepartment(Long id, String servicedepartment);

}
