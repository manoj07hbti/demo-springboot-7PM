package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

@RestController
public class AssignementController {

    @RequestMapping("/calculator")
    public String calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator application ");
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your Second number : ");
        int b = sc.nextInt();

        int sum = a+b;
        int sub = a-b;
        double divide = (a*1.0/b);
        return "Sum = " + sum + " , sub = " +sub + "  divide = " +divide;

    }
    @RequestMapping("/Employees")
    public Employee createEmployees(){
        Employee employees = new Employee("Ashish", 64, "patent", 30000);
        return employees;

    }

    @RequestMapping("/EmployeeList")
    public ArrayList<Employee> createEmployeeList(){
        ArrayList<Employee> EmployeeList = new ArrayList<>();
        Employee employee1 = new Employee("shobek", 45, "patent", 25000);
        Employee employee2 = new Employee("nitin", 44, "gas", 18000);
        Employee employee3 = new Employee("dhirendra", 5, "CS", 75000);
        EmployeeList.add(employee1);
        EmployeeList.add(employee2);
        EmployeeList.add(employee3);
        return EmployeeList;
    }

    @RequestMapping("/Armstrong")
    public String Armstrong(){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter number to check Armstrong  ....");
        int a = scanner.nextInt();
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

    @RequestMapping("/Palendrome")
    public String palendrome(){
        System.out.println("Enter number to check whether number is palendrome or not : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
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
