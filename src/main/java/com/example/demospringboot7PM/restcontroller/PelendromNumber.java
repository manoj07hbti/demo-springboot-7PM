package com.example.demospringboot7PM.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class PelendromNumber {
    @RequestMapping("/palendrome")
    public String pal() {
        int r,sum=0,n,temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
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
