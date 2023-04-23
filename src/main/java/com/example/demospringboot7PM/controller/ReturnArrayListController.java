package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ReturnArrayListController {

        @RequestMapping("/book")
        public ArrayList<String> book() {
            ArrayList<String> object = new ArrayList<>();
            object.add("Hindi");
            object.add("English");
            object.add("CS");
            object.add("History");
            return object;
        }

        @RequestMapping("/get")
        public Student getStudent() {
            Student student = new Student("Rakesh", 32, "cs");
            return student;

        }
    }

