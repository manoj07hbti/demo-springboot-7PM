package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorController {
@RequestMapping("/addition/{a}/{b}")

    public String add(@PathVariable int a, @PathVariable int b){
        int c;

        String result ;

        c=a+b;

        result =" Addition of "+a+" and "+b+" = "+c;

            return result;
    }
    @RequestMapping("/subtraction/{a}/{b}")

    public String subtract(@PathVariable int a,@PathVariable int b){
        int c;

        String result;

        c=a-b;

        result = "subtraction of "+a+" and "+b+"= "+c;

        return result;
    }
    @RequestMapping("/multiply/{a}/{b}")

    public String multi(@PathVariable int a,@PathVariable int b){
         int c;

         String result;

         c=a*b;

         result = "multiply of "+a+" and "+b+"="+c;

         return result;
    }
    @RequestMapping("/division/{a}/{b}")
    public String division(@PathVariable int a, @PathVariable int b){
          double c;

         String result;

         c=(double)a/b;

         result = "division of "+a+" and "+b+" ="+c;

         return result;


    }


    }




