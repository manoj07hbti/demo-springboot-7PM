package com.example.demospringboot7PM.requastparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Calculator_param {
    @RequestMapping("/Addition_param")//http://localhost:8081/Addition_param?a=15&b=5
    public String Add(@RequestParam int a, @RequestParam int b){
        return "Addition of a and b= "+(a+b);
    }
    @RequestMapping("/Subtract_param")
    public String Sub(@RequestParam int a ,@RequestParam int b){
        return "Subtraction of a and b = "+(a-b);
    }
    @RequestMapping("/Multiply_param")
    public String multiply(@RequestParam int a ,@RequestParam int b) {
        return "Multiply a of b = " + (a*b);
    }
    @RequestMapping("/Divided_param")
    public String Divided(@RequestParam int a , @RequestParam int b) {
        return "Divided by a and b = " + a/b;
    }

}
