package com.example.demospringboot7PM.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class ArmstrongNumber {
    @RequestMapping("/armstrong")
    public String arms() {
        int a, arm = 0, n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        while (n != 0) {
            a = n % 10;
            arm = arm + (a * a * a);
            n /= 10;
        }
        if (arm == temp)
            return (temp + " is a armstrong number ");
        else
            return (temp + " is not a armstrong number ");
    }
}
