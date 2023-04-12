package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeParamController {
    @RequestMapping("/display_emp")
    public String createEmployee(@RequestParam String name,@RequestParam int empcode,@RequestParam String city){
        return "Employee name is : " +name +"empcode : "+empcode +"City " +city;
    }

    //calculator param controller

    @RequestMapping("/add_calc")
    public String Addition(@RequestParam int a, @RequestParam int b){
        int c;
        String result;

        c=a+b;
        result= "Additiom of given number "+a+" and "+b+"  = " +c;
        return result;
    }

    @RequestMapping("/subt_calc")
    public String Subtraction(@RequestParam int a, @RequestParam int b){
        int c;
        String result;

        c=a-b;
        result= "Subtraction of given number "+a+" and "+b+"  = " +c;
        return result;
    }

    @RequestMapping("/multi_calc")
    public String Multiply(@RequestParam int a, @RequestParam int b){
        int c;
        String result;

        c=a*b;
        result= "Multiply of given number "+a+" and "+b+"  = " +c;
        return result;
    }


}
