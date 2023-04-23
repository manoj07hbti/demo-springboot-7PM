package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableDemoController {

    @RequestMapping("/addData/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){

        return "add result is...."+(a+b);
    }
    @RequestMapping("/age_verification/{age}")
    public String ageVerification(@PathVariable int age){
        if (age<18){
            return " parson age is less then 18 then parson is count in child citizen";
        } else
        if (age>=18 & age<60) {
            return "parson age is 18 plus then parson is count in younger citizen ";
        }else{
            return " parson age is 60 plus then parson is count in senior citizen";
        }

    }
    @RequestMapping("/data/{name}/{age}/{stream}")
    public String myData(@PathVariable String name,@PathVariable int age, @PathVariable String stream){
        return "my data is......"+"name :"+name+" age :"+age+" stream :"+stream;

    }
}
