package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {
    @RequestMapping("/palindrome/{till}")
    public String palindrome(@PathVariable int till){

        int number,remainder,temp;
        String output=" ";

    for (number=0;number<=till;number++) {
        int result=0;
        temp = number;
        while (temp > 0) {
            remainder = temp % 10;
            result = result * 10 + remainder;
            temp /= 10;
        }
        if (number == result) {
            output =output+", "+ number;
        }
//        else {
//            output = temp + " is not Palindrome number";
//        }
    }
        return "Palindrome Numbers:  "+output;
    }
}
