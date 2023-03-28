package com.example.demospringboot7PM.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_Controller {

    //output from browser : localhost:8080/hy
    @RequestMapping("/hy")
    public void hello() {

        System.out.println("Hello to Spring Boot...");
    }

    @RequestMapping("msz")

    //output from browser with return: localhost:8080/msz

    public String message() {

        return "Welcome to Spring Boot Output with Return from browser..";
    }

    @RequestMapping("/add")

    //output from both console and browser with return : localhost:8080/add

    public String add() {

        int a = 55;
        int b = 44;

        System.out.println("Addition of a and b is :" + (a + b));

        return "Addition of a and b is :" + (a + b);
    }


}
