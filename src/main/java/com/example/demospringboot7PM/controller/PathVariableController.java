package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {
//@RequestMapping("endpoint_name/{path_variable_name}")
    @RequestMapping("/welcome_msg/{name}")
    public String message(@PathVariable String name){

        //String msg="Welcome to Spring Boot "+name;

        return "Welcome to Spring Boot "+name;
    }

    @RequestMapping("/verify_age/{age}")
    public String  verifyAge(@PathVariable int age){
        if (age<18){

          return "Person is child";
        }else if(age>18 & age<45){

            return "Person is Young";
        }else {

            return "Person is Old";
        }

    }

    @RequestMapping("/display_info/{name}/{section}")
    public String display(@PathVariable String name, @PathVariable String section){

      return "Student Name is : "+name +" Section is: "+section;
    }

}
