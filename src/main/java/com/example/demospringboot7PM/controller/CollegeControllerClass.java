package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.modelClass.CollegeManagement;
import com.example.demospringboot7PM.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeControllerClass {
    @Autowired
    CollegeService service;

    @PostMapping("/College Add")
    public String AddCollegeName(@RequestBody CollegeManagement college){
        service.AddCollegeName(college);
        return "College name added successfully";
    }
    @GetMapping("/Find CollegeList")
    public List<CollegeManagement> FindListCollege(){
        return service.FindListCollege();
    }
    @PutMapping("/College update/{id}/{category}")
    public String UpdateCollege(@PathVariable long id,@PathVariable String category){
        service.UpdateCollege(id, category);
        return "Category updated Successfully";
    }
    @DeleteMapping("/College remove/{id}")
    public String Delete(@PathVariable long id){
        service.Delete(id);
        return "Id deleted successfully";
    }
    @GetMapping("/Get Cotegorywithname/{category}/{collegename}")
    public List<CollegeManagement> readCategorywithname(@PathVariable String category, @PathVariable String collegename ){
        return service.readCategorywithname(category, collegename);
    }
    @GetMapping("/Get Category/{category}")
    public List<CollegeManagement>readwithcategory(@PathVariable String category){
        return service.readwithcategory(category);
    }
    @GetMapping("/Tech collegesql")
    public List<CollegeManagement> gettechCollege(@RequestParam String category){

        return service.findtechCollege(category);
    }
}
