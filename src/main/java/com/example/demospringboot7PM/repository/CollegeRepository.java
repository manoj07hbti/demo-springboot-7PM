package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.modelClass.CollegeManagement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollegeRepository extends JpaRepository<CollegeManagement, Long> {
    /*we should be able to find College with name and type
    we should be able to find all Tech College  in ascending order with name*/



    public List<CollegeManagement> findByCategoryAndCollegename(String category, String collegename);
    public List<CollegeManagement> findByCategory(String category);

}
