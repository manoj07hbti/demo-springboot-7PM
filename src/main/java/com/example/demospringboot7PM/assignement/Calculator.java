package com.example.demospringboot7PM.assignement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController
public class Calculator {
    @RequestMapping("/Add")
    public String Addition(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        return "this is sum of :"+(a+b);

    }
    @RequestMapping("/Sub")
    public String Subtract(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        return "this is subtract :"+ (a-b);

    }
    @RequestMapping("/multi")
    public String multiply(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        return "this is multiply :"+ (a*b);

    }
    @RequestMapping("/div")
    public String divided(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        return "this is divided :"+ (a/b);

    }


}
