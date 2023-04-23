package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamDemoController {
        @RequestMapping("/addData")
        public String add(@RequestParam int a, @RequestParam int b) {
            return "add result is...." + (a + b);
        }

        @RequestMapping("/hello_message")
        public String findAge(@RequestParam int age) {
            if (age < 18) {
                return "parson is child";
            } else if (age >= 18 & age < 45) {
                return "parson is young";
            } else {
                return "parson is old";
            }

        }

        @RequestMapping("/my_data")
        public String myData(@RequestParam String name, @RequestParam int age, @RequestParam String stream) {
            return "my data is......" + "name :" + name + " age :" + age + " stream :" + stream;

        }
    }

