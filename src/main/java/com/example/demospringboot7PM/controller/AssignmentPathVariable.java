package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class AssignmentPathVariable {

    @RequestMapping("/calculatorPathVariable/{a}/{b}")
    public String calculatorPathVariable(@PathVariable int a, @PathVariable int b){
        int sum = a+b;
        int sub = a-b;
        double divide = (a*1.0/b);
        return "Sum = " + sum + " , sub = " +sub + "  divide = " +divide;

    }
    @RequestMapping("/EmployeesPathVariable/{name}/{id}/{department}/{salary}")
    public Employee createEmployeesPathVariable(@PathVariable String name, @PathVariable int id, @PathVariable String department, @PathVariable int salary){
        Employee employees = new Employee(name, id, department, salary);
        return employees;

    }


    @RequestMapping("/ArmstrongPathVariable/{number}")
    public String ArmstrongPathVariable(@PathVariable int number){
        int a = number;
        int rem= 0;
        int i =a;
        while(i!=0){
            rem = rem + (i%10)*(i%10)*(i%10);
            i = i/10;
        }
        if (rem ==a){
            return "Number is armstrong number : " +rem;
        }else
        {return "Number is not armstrong number : " +a;}
    }
    @RequestMapping("/PalendromePathVariable/{number}")
    public String palendromePathVariabl(@PathVariable int number){
        int a = number;
        int i= a;
        int sum=0;
        while (i!=0){
            sum = sum*10+ i%10;
            i = i/10;

        }
        if (sum==a){
            return "entered number is palendrome : " +a;
        }else {
            return "entered number is not palendrome : "  + a;
        }
    }
}


