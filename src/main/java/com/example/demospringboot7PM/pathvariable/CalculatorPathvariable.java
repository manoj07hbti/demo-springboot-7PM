package com.example.demospringboot7PM.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController

public class CalculatorPathvariable {
    @RequestMapping("/Addition/{a}/{b}") //http://localhost:8081/Addition/5/6
    public String Addition(@PathVariable int a, @PathVariable int b){
        return "Adding of a and b= "+(a+b);
    }
    @RequestMapping("/Subtract/{a}/{b}")
    public String Subtract(@PathVariable int a, @PathVariable int b){
        return "Different a/b is = " +(a-b);
    }
    @RequestMapping("/Multiply/{a}/{b}")
    public String Multi(@PathVariable int a, @PathVariable int b){
        return "Multiply a and b = "+a*b;
    }
    @RequestMapping("/Divided/{a}/{b}")
    public String Divided(@PathVariable int a, @PathVariable int b){
        return "Divided by a and b= "+a/b;
    }

}
