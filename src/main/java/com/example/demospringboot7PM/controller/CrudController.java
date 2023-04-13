package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CrudController {

    ArrayList<String> course =new ArrayList<>();
    //CRUD
    // C= Create or Add
@RequestMapping("/add_course/{name}")
    public String add(@PathVariable String name){
        course.add(name);
        return "Course is added successfully  " +name;

    }
    @RequestMapping("/get_course")
    public ArrayList<String> getCourse() {
        return course;
    }
    @RequestMapping("/update_index/{index}/{name}")
    public String updateCourse( @PathVariable int index,@PathVariable String name){
    course.set(index, name);
    return "Course name updated as " +name;

    }

    @RequestMapping("/delete_courser/{name}")
    public String deleteCourse(@PathVariable int index){
    course.remove(index);
    return "Course deleted successfully ";
    }


}
