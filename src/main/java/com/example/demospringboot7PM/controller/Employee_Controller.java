package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Controller {
@RequestMapping("/InfoEmp/{name}/{age}/{city}")

    public String InfoEmp(@PathVariable String name , @PathVariable int age, @PathVariable String city) {


    return "Employee name is :" + name + "  age : " + age + "  city :";


}
@RequestMapping("/Disply_info/{name}/{age}/{section}/{city}")

      public String Disply(@PathVariable String name,@PathVariable int age,@PathVariable String section ,@PathVariable String city){

       return "Student name is :" + name + "  age :" + age + "  Section :" + section + "  city :" + city;

      }

}
