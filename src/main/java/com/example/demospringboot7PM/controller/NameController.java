package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.modal.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

@RestController
public class NameController {
    @RequestMapping("/name")
    public void name(){
        System.out.println("shekhar gupta");
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "hello soringboot";
    }
    @RequestMapping("/sub")
    public String subtract(){
        int a=544;
        int b=44;

        return "subtract is : " +(a-b);
    }
    @RequestMapping("/scan")
    public String  info() {

        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter your msg ");
        String msg=scanner.nextLine();
        return msg;
    }

    @RequestMapping("/data")
    public Employee employee() {
        Employee employee=new Employee("shekhar",27,"IT");

        return employee;
    }
    @RequestMapping("/list")
    public ArrayList<String>getmethod(){
        ArrayList<String>list=new ArrayList<>();

        list.add("core java");
        list.add("Springbot");
        list.add("Microservice");
        return list;
    }
    @RequestMapping("/employe")
    public ArrayList<Employee>employees() {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee=new Employee("shekhar",27,"IT");
        Employee employee1=new Employee("karan",25,"sales");

        employees.add(employee);
        employees.add(employee1);
        return employees;

    }
}
