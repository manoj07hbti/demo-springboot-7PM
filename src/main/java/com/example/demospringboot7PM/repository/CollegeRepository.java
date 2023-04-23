package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.modelClass.CollegeManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CollegeRepository extends JpaRepository<CollegeManagement, Long> {
    /*we should be able to find College with name and type
    we should be able to find all Tech College  in ascending order with name*/



    public List<CollegeManagement> findByCategoryAndCollegename(String category, String collegename);
    public List<CollegeManagement> findByCategory(String category);
//we should be able to find all Tech College  in ascending order with name
    @Query(value = "select * from COLLEGE_MANAGEMENT where CATEGORY=Technical",nativeQuery=true)
    public List<CollegeManagement> findCategoryByNativeQuery(@Param("category") String category);

}
