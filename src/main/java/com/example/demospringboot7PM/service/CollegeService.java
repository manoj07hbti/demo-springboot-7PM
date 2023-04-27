package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.modelClass.CollegeManagement;
import com.example.demospringboot7PM.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    CollegeRepository repository;
    public String AddCollegeName(CollegeManagement college){
        repository.save(college);
        return "College name added successfully";
    }
    public List<CollegeManagement> FindListCollege(){
        return repository.findAll();
    }
    public String UpdateCollege(long id, String category){
        CollegeManagement college= repository.getById(id);
        college.setCategory(category);
        repository.save(college);
        return "Category updated Successfully";

    }
    public String Delete(long id){
        repository.deleteById(id);
        return "Id deleted successfully";
    }

    public List<CollegeManagement> readCategorywithname(String category, String collegename ){
        return repository.findByCategoryAndCollegename(category,collegename);
        }
    public List<CollegeManagement>readwithcategory(String category){
        return repository.findByCategory(category);
    }
     public List<CollegeManagement> findtechCollege(String category){

        return repository.findCategoryByNativeQuery(category);
    }
    public List<CollegeManagement>getAscending(){
        return repository.findByOrderByCollegenameAsc();
    }
    public List<CollegeManagement> getDescending(){
        return repository.findByOrderByCollegenameDesc();
    }

}
