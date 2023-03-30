package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class PathVarController {
    @RequestMapping("/addi/{a}/{b}")
    public String addi(@PathVariable int a, @PathVariable int b) {

        int result = a + b;
        return "The Ans is: " + result;
    }

    @RequestMapping("/subi/{a}/{b}")
    public String subi(@PathVariable int a, @PathVariable int b) {

        int result = a - b;
        return "The Ans is: " + result;
    }
    @RequestMapping("/divi/{a}/{b}")
    public String divi(@PathVariable int a, @PathVariable int b) {

        int result = a / b;
        return "The Ans is: " + result;
    }
    @RequestMapping("/mult/{a}/{b}")
    public String mult(@PathVariable int a, @PathVariable int b) {

        int result = a * b;
        return "The Ans is: " + result;
    }

}
