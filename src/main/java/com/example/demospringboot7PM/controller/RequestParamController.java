package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
    @RequestMapping("/number_addition")
    public String add(@RequestParam int a,@RequestParam int b){

        int c=a+b;

        return "Addition of A + B : "+c;
    }

}
