package com.example.demospringboot7PM.crud_controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Doctor_Crud {
    ArrayList<Doctor_modal> list =new ArrayList<>();
    @RequestMapping("/Doctor_detail/{name}/{department}/{workinghospital}/{salary}")//http://localhost:8081/Doctor_detail/aman dev/incharge/FS Hospital/55000
      public String Add(@PathVariable String name, @PathVariable String department, @PathVariable String workinghospital,@PathVariable int salary){
      Doctor_modal doctor =new Doctor_modal(name, department, workinghospital, salary);
      list.add(doctor);
      return "Doctor details are added successfully "+name+" "+department+" "+workinghospital+" "+salary;
    }
    @RequestMapping("/get_doctor")//http://localhost:8081/get_doctor
    public ArrayList<Doctor_modal> getdoctor(){
        return list;
    }
    @RequestMapping("/update_doctor/{index}/{name}")
    public String update(@PathVariable int index,@PathVariable String name){
        Doctor_modal doctor= list.get(index);
        doctor.setName(name);
        return "Doctor name is updated successfully "+name;
    }
    @RequestMapping("/remove_doctor/{index}")
    public String delete(@PathVariable int index){
        list.remove(index);
        return "successfully remove"+index;
    }
}
