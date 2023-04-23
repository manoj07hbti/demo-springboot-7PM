package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @RequestMapping("/sum")
    public String add() {
        int a = 67;
        int b = 56;
        //int sum=a+b;
        return "this is my sum .." + (a + b);
    }

    @RequestMapping("/sub")
    public String subtraction() {
        int a = 87;
        int b = 56;
        //int sum=a+b;
        return "this is my subtraction .." + (a - b);

    }

    @RequestMapping("/mul")
    public String multi() {
        int a = 8;
        int b = 6;
        //int sum=a+b;
        return "this is my multi .." + (a * b);
    }

    @RequestMapping("/divid")
    public String divide() {
        int a = 61;
        int b = 5;
        //int sum=a+b;
        return "this is my sum .." + (a / b);
    }

}
