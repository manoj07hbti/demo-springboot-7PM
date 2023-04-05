package com.example.demospringboot7PM.bodyannotation;

import com.example.demospringboot7PM.pathvariable.Employee_Class;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Employee_Body {
    ArrayList<Employee_Class> employee=new ArrayList<>();
    @PostMapping("/Add_employees")
    public String AddEmployee(@RequestBody Employee_Class employe){
        employee.add(employe);
        return "Successfully added";
    }
    @GetMapping("/get_employees")
    public ArrayList<Employee_Class> getemployee(){
        return employee;
    }
    @PutMapping("/employee_updates/{index}/{name}")
    public String update(@PathVariable int index, @PathVariable String name){
        Employee_Class employe=employee.get(index);
        employe.setName(name);
        return "Successfully update";
    }
    @DeleteMapping("/delete_employee/{index}")
    public String delete(@PathVariable int index){
        employee.remove(index);
        return "successfully remove";
    }

}
