package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String hello(){
        String msg="Welcome to Java Programming";

        return msg;
    }
    @RequestMapping("/cube")
    public String cube(){
        int a=8,res;
        res=a*a*a;
        String result="Cube of "+a+" = "+String.valueOf(res);
        return result;
    }
}
