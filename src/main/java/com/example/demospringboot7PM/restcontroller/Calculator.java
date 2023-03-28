package com.example.demospringboot7PM.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

public class Calculator {
    @RequestMapping("/add")
    //add method of calculator

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

    //subtract method of calculator

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

    //multiply method of calculator

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

    //division method of calculator

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
