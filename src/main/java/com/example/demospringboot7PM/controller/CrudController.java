package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CrudController {

    ArrayList<String> course= new ArrayList<>();

    //CRUD

    //C- create or add
    @RequestMapping("/add_course/{name}")
    public String add(@PathVariable String name){
        course.add(name);
        return "Course is added successfully "+name;
    }

    //R- read or get
    @RequestMapping("/get_courses")
    public ArrayList<String> getCourse(){

        return course;
    }
   //U- update
    @RequestMapping("/update_course/{index}/{name}")
    public String updateCourse(@PathVariable int index, @PathVariable String name){

        course.set(index,name);

        return "Course name updated as "+name;
    }
    //D - delete
    @RequestMapping("/delete_course")
    public String deleteCourse(@RequestParam int index){

        course.remove(index);

        return "Course delete successfully ";
    }


}
