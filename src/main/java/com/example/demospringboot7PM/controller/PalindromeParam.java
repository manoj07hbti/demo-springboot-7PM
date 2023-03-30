package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeParam {


    @RequestMapping("/palnum_request_param")
    public String palnum(@RequestParam int a) {
        int r,sum=0,n,temp;

        n = a;
        temp = n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;

        }
        if(temp==sum)
            return (temp+" is a palindrome number ");
        else
            return (temp+" is not a palindrome number");
    }
}
