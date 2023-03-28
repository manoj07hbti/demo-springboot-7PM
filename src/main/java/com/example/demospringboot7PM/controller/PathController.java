package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

    @RequestMapping ("/nameStatus/{name}")
    public String intro( @PathVariable String name){
        return "Welcome to spring boot application  : " +name;
    }
    @RequestMapping ("/ageStatus/{age}")
    public String ageStatus( @PathVariable int age){
        if (age<18) {
            return "You ar child  : and your age is  " + age;
        }
        if (age>18 && age<45) {
            return "You ar young  : and your age is  " + age;
        }else {
            return "You ar old  : and your age is  " + age;
        }
    }
    @RequestMapping ("/NameAge/{name}/{age}")
    public String ageStatus( @PathVariable String name,  @PathVariable int age){

            return "Your name is  :" +name + " and your age is  " + age;

    }

}
