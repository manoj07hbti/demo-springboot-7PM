package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestparamController {

    @RequestMapping("/welcomeRequestParam")
    public String welcomeRequestParam(@RequestParam String name){
        return "Welcome to spring boot application : " +name;
    }

    @RequestMapping ("/ageparamStatus")
    public String ageparamStatus( @RequestParam int age){
        if (age<18) {
            return "You ar child  : and your age is  " + age;
        }
        if (age>18 && age<45) {
            return "You are young  : and your age is  " + age;
        }else {
            return "You are old  : and your age is  " + age;
        }
    }
    @RequestMapping ("/NameAgeparam")
    public String NameAgeparam( @RequestParam String name,  @RequestParam int age){

        return "Your name is  :" +name + " and your age is  " + age;

    }
}
