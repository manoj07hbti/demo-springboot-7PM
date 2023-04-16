package com.example.demospringboot7PM.controller.prectice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPrectice {
      @RequestMapping("/verify_age/{age}")
    public String verifyAge(@PathVariable int age){

        if(age<18){

        return "Person is Child";
        }else if(age>18 & age<45){

            return "Person is young";
        }else{

            return "Person is Old";
        }








    }











}
