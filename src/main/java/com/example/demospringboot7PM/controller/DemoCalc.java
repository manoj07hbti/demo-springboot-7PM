package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController

public class DemoCalc {
    @RequestMapping("/add")
    public String add() {

        System.out.println("Please enter value of a :");
        Scanner scannerObj = new Scanner(System.in);
        int a = scannerObj.nextInt();
        System.out.println("Please enter value of b:");
        int b = scannerObj.nextInt();
        int result = a + b;
        return "The Ans is: " + result;

    }

    @RequestMapping("/sub")
    public String sub() {

        System.out.println("Please enter value of a :");
        Scanner scannerObj = new Scanner(System.in);
        int a = scannerObj.nextInt();
        System.out.println("Please enter value of b:");
        int b = scannerObj.nextInt();
        int result = a - b;
        return "The Ans is: " + result;
    }

    @RequestMapping("/mul")
    public String mul() {

        System.out.println("Please enter value of a :");
        Scanner scannerObj = new Scanner(System.in);
        int a = scannerObj.nextInt();
        System.out.println("Please enter value of b:");
        int b = scannerObj.nextInt();
        int result = a * b;
        return "The Ans is: " + result;

    }
    @RequestMapping("/div")
    public String div() {

        System.out.println("Please enter value of a :");
        Scanner scannerObj = new Scanner(System.in);
        int a = scannerObj.nextInt();
        System.out.println("Please enter value of b:");
        int b = scannerObj.nextInt();
        int result = a / b;
        return "The Ans is: " + result;

    }
}


