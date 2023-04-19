package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EngineerRepository extends JpaRepository<Engineer, Long> {

    public Engineer findByEmpId(long empId);

    @Query(value = "select * from Engineer WHERE department =:department",nativeQuery = true)
    public List<Engineer> getEngineerByNativeQuery(@Param("department") String department);


}
