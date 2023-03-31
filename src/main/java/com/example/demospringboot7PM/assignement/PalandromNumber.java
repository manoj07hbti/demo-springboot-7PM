package com.example.demospringboot7PM.assignement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController

public class PalandromNumber {
    @RequestMapping("/Palindrom")
    public String checcknumber(){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
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
