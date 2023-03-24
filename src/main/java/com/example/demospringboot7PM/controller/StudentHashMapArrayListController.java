package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@RestController
public class StudentHashMapArrayListController {

    @RequestMapping("/hashmap_arraylist")
    public HashMap<Integer, HashSet<Student>> students(){

        HashMap<Integer, HashSet<Student>> data= new HashMap<>();
        HashMap<Integer, HashSet<Student>> output= new HashMap<>();

        HashSet<Student> studentinfo= new HashSet<>();
        Student st1= new Student("Praveen",24,1,"CS");
        Student st2= new Student("Ajeet",25,2,"IT");
        Student st3= new Student("Anurag",28,3,"IT");
        Student st4= new Student("Ankit",25,2,"CS");
        Student st5= new Student("Shiva",22,5,"CS");

        studentinfo.add(st1);
        studentinfo.add(st2);
        studentinfo.add(st3);
        studentinfo.add(st4);
        studentinfo.add(st5);



        data.put(1,studentinfo);
        HashSet<Student> list= new HashSet<>();
        Set<Integer> keys= data.keySet();
        for (Integer key : keys){

                for (Student var : data.get(key)){
                    if (var.getDepartment().equals("CS")){
                      //  System.out.println("Name : " + var.getName()+" Roll Number : "+var.getAge()+" Course : "+var.getRoll_no()+" College : "+var.getDepartment());
                    list.add(var);
                    }
                }
                output.put(key,list);
        }


    //This code is for ArrayList(to prevent duplicate data)

//        for (Integer var : data.keySet()){
//            for (int i=0;i<studentinfo.size();i++){
//                for(int j=i+1;j<studentinfo.size();j++) {
//                   if ((studentinfo.get(i).hashCode()) == (studentinfo.get(j).hashCode()))
//                        studentinfo.remove(i);
//                }
//            }
//        }

        return output;

    }

}
