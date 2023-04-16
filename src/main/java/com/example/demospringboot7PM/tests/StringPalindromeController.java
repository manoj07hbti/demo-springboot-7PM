package com.example.demospringboot7PM.tests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringPalindromeController {


    @GetMapping("/palindrome/{value}")
    public String palindrome(@PathVariable String value){
        String reverse="";
    int length=value.length();
    for (int i=length-1;i>=0;i--){
        reverse= reverse+value.charAt(i);
    }

    if (value.equals(reverse)){
        return value+" is Palindrome";
    }
    else {
        return value+" is not Palindrome";
    }

    }

}
