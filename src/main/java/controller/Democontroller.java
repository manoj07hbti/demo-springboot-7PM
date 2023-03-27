package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController

public class Democontroller {

    @RequestMapping

    public void hello() {

        System.out.println("hello");

    }

    @RequestMapping("/msg")

    public String message(){

        return"welcome to spring boot Apllication";

    }
    @RequestMapping("addition")

    public String addition(){

        int a=343;
        int b=33;

        return "Addition of given number is : " +(a+b);

    }

    @RequestMapping("/scanner")

    public String input(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter message enter to be displayed on browser ");
        String msg=scanner.nextLine();
        return msg;
    }



}