package com.example.demospringboot7PM.crud_controller;

import com.example.demospringboot7PM.pathvariable.Employee_Class;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Employee_Crud {
    ArrayList<Employee_Class> employe=new ArrayList<>();
    @RequestMapping("/Add_employee/{name}/{department}/{id}")
    public String Addemployee(@PathVariable String name,@PathVariable String department,@PathVariable int id){
        Employee_Class employee =new Employee_Class(name, department,id);
        employe.add(employee);
        return "successfully add";
    }
    @RequestMapping("/get_employee")
    public ArrayList<Employee_Class> getEmploye(){
        return employe;
    }
    @RequestMapping("/update_employee/{index}/{name}")
    public String updateemployee(@PathVariable int index,@PathVariable String name){
        Employee_Class employ= employe.get(index);
        employ.setName(name);
        return "successfully update"+name;
    }
    @RequestMapping("/remove_employee/{index}")
     public String removeemployee(@PathVariable int index){
        employe.remove(index);
        return "successfully remove"+index;
     }

}
