package com.example.demospringboot7PM.controller.prectice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calcPrectice {
@RequestMapping("/Addition/{a}/{b}")
      public String add(@PathVariable int a,@PathVariable int b){
          int c;

          String result;

          c=a+b;

          result="Addition of :"+a+" and "+b+"="+c;

          return result;

      }
      @RequestMapping("/subtract/{a}/{b}")
      public String subtract(@PathVariable int a,@PathVariable int b){

           int c;

           String result;

           c=a-b;

           result = "subtract of :"+a+" and "+b+"= "+c;

           return result;

      }
      @RequestMapping("multi/{a}/{b}")
      public String multi(@PathVariable int a, @PathVariable int b){

        int c;

        String result;

        c=a*b;

        result = "multiply of :"+a+" and "+b+"= "+c;

        return result;
      }
      @RequestMapping("/divide/{a}/{b}")
      public String divide(@PathVariable int a,@PathVariable int b){

         int c;

         String result;

         c=a/b;

         result="divide of :"+a+" and "+b+"="+c;

         return result;











      }










}
