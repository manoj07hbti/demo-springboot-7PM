package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpParam {



        @RequestMapping("/employee_request_param")

        public String Employee(@RequestParam String fname, @RequestParam String lname, @RequestParam String dept, @RequestParam int empId) {


            return "Employee: " + fname + " " + lname + " " + "Dept: " + dept + " Emp_Id: " + empId;
        }
    }

