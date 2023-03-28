package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.model.Request;
import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


@RestController
public class StudentCRUDController {

    ArrayList<Student> studentsInfo= new ArrayList<>();
    @RequestMapping(value = "/add_students", method = RequestMethod.POST)
    public Student create(@RequestBody Student student){

        studentsInfo.add(student);

        return student;

    }
    @RequestMapping(value = "/remove_student",method = RequestMethod.DELETE)
    public String remove(@RequestParam int index){

        studentsInfo.remove(index);

        return "Deleted Successfully";
    }
    @RequestMapping(value = "/update_student",method = RequestMethod.PUT)
    public String  update(@RequestBody Request request){

        int index=request.getIndex();
        Student oldStudent= studentsInfo.get(index);
        Student newStudent= request.getStudent();

        oldStudent.setName(newStudent.getName());
        oldStudent.setAge(newStudent.getAge());
        oldStudent.setRoll_no(newStudent.getRoll_no());
        oldStudent.setDepartment(newStudent.getDepartment());


        return "Updated Successfully";
    }
    @RequestMapping(value = "/studentsInfo",method = RequestMethod.GET)
    public ArrayList<Student> display(){

        return studentsInfo;
    }
//    @RequestMapping("/check")
//    public String msg(){
//        String res="";
//        int c,a=4,b=4;
//        c=a+b;
//
//        return res;
//    }

}
