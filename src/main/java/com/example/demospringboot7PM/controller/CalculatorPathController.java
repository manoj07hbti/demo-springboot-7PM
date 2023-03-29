package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorPathController {
    @RequestMapping("/Sum/{a}/{b}")
    public String sum(@PathVariable int a,@PathVariable int b){
        int addition=a+b;
        return "sum is : " +addition;
    }
    @RequestMapping("/Sub/{a}/{b}")

    public String  Sub(@PathVariable int a ,@PathVariable int b){
        int subtract=a-b;
        return "subtract is : "+subtract ;
    }
    @RequestMapping("/Multi/{a}/{b}")

    public String  multiply(@PathVariable int a,@PathVariable int b){
        int multi=a*b;
        return "multi is : "+multi;
    }
    @RequestMapping("/Devide/{a}/{b}")

    public String  devide(@PathVariable double a,@PathVariable double b){
        double Devide=a/b;
        return "Devide is : "+Devide;
    }

}
