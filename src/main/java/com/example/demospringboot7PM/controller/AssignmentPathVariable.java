package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentPathVariable {
    @RequestMapping("/add/{a}/{b}")
    public String Addition(@PathVariable int a, @PathVariable int b){
        int c;
        String result;

        c=a+b;
        result= "Additiom of given number "+a+" and "+b+"  = " +c;
        return result;
    }

    @RequestMapping("/subt/{a}/{b}")
    public String Subtraction(@PathVariable int a, @PathVariable int b){
        int c;
        String result;

        c=a-b;
        result= "Subtraction of given number "+a+" and "+b+"  = " +c;
        return result;
    }

    @RequestMapping("/multi/{a}/{b}")
    public String Multiply(@PathVariable int a, @PathVariable int b){
        int c;
        String result;

        c=a*b;
        result= "Multiply of given number "+a+" and "+b+"  = " +c;
        return result;
    }


}
