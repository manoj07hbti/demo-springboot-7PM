package com.example.demospringboot7PM.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class PalindromNumber {
    @RequestMapping("/Palindro/{number}")
    public String checknumber(@PathVariable int number){
        int r;
        int sum=0;
        int temp=number;
        while (number > 0) {
            r= number%10;
            sum=(sum*10)+r;
            number=number/10;
        }
        if(temp==sum){
            return "this is palindrom number "+number;
        }
        else {
            return "this is not palindrom number "+number;
        }
    }
}
