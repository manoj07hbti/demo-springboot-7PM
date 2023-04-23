package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

@RestController
public class DemoController {

    //ENDPOINT 1
    @RequestMapping("/hello")
    public void hello(){

        System.out.println("Hello To Spring Boot Application .....");
    }

    @RequestMapping("/msg")
    public String message(){

        return "Welcome to Spring Boot Application ";
    }

    @RequestMapping("addition")
    public String addition(){
        int a=343;
        int b=33;

        return "Addition of given number is : " +(a+b);
    }

    @RequestMapping("/scanner")
    public String input(){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter message to be displayed on Browser ....");
        String msg=scanner.nextLine();
        return msg;
    }

    @RequestMapping("/student")
    public Student createStudent(){
        Student student= new Student("Raj",23,"IT");

        return  student;

    }

    @RequestMapping("/course")
    public ArrayList<String> getCourse(){

        ArrayList<String> course= new ArrayList<>();

        course.add("Java");
        course.add("Spring Boot");
        course.add("Micro services");

        return course;
    }

    @RequestMapping("/students")
    public ArrayList<Student> getStudents(){

        ArrayList<Student> students= new ArrayList<>();
        Student student1= new Student("Raj",23,"IT");
        Student student2= new Student("Mukesh",24,"CS");
        Student student3= new Student("Mohit",23,"IT");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return students;

    }
    @RequestMapping("/Employee")
    public ArrayList<Employee> getEmployee(){

        ArrayList<Employee> Employees= new ArrayList<>();
        Employee Employee1= new Employee("Raj",23,"IT", 222.2);
        Employee Employee2= new Employee("Mukesh",24,"CS", 228.2);
        Employee Employee3= new Employee("Mohit",23,"IT", 453.5);
        Employees.add(Employee1);
        Employees.add(Employee2);
        Employees.add(Employee3);
        return Employees;

    }

    @RequestMapping("/range")
    public String inputRange(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter range of number to check even ");
        int range=scanner.nextInt();
        String output="";
        for(int i=1; i<range;i++){

            if(i%2==0){
                output+=i+ " is Even  Number ";
            }
        }

        return output;
    }



}