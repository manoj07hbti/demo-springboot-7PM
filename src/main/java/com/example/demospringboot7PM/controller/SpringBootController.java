package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

    @RequestMapping("/message_add")
    public String addMethod(){
        return "add spring boot application successfully";
    }
}
