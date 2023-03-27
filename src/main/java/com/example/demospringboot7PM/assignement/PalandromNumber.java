package com.example.demospringboot7PM.assignement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController

public class PalandromNumber {
    @RequestMapping("/Palindrom")
    public void checcknumber(){
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
            System.out.println("this is palindrom number");
        }
        else {
            System.out.println("this is not palindrom number");
        }
    }
}
