package com.example.demospringboot7PM.modal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Demo_Student {
@RequestMapping
    public void student(){
    ArrayList<Student> list=new ArrayList<>();

    //creat data of  Students
    Student Student1 =new Student("Shekhar",23,"IT");
    Student Student2=new Student("karan",24,"Engineer");

        list.add(Student1);
        list.add(Student2);

        for (Student var : list){
        System.out.println("Students : " +var.getName()+ " : age is  : "+var.getAge()+" : Section : " +var.getSection());
    }
}

    public static void main(String[] args) {

        Demo_Student obj=new Demo_Student();

        obj.student();
    }
}