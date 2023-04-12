package com.example.demospringboot7PM.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/welcome_request_param")
    public String message(@PathVariable String name){

        //String msg="Welcome to Spring Boot "+name;

        return "Welcome to Spring Boot "+name;
    }

    @RequestMapping("/verify_age_request_param")
    public String  verifyAge(@RequestParam int age){
        if (age<18){

            return "Person is child";
        }else if(age>18 & age<45){

            return "Person is Young";
        }else {

            return "Person is Old";
        }

    }

    @RequestMapping("/display_info_request_param")
    public String display(@RequestParam String name,@RequestParam String section){

        return "Student Name is : "+name +" Section is: "+section;
    }
}
