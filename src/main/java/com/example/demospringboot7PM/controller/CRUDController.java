package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CRUDController {

    int c;
    @RequestMapping(value = "/addition", method = RequestMethod.POST)
    public String add(@RequestParam int a, @RequestParam int b){

        c=a+b;

        return "Addition Successful";

    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String result(){

        return "Result is : "+c;
    }

}
