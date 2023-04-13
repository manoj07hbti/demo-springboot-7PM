package com.example.demospringboot7PM.controller;


import com.example.demospringboot7PM.model.Request;
import com.example.demospringboot7PM.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class StudentCRUDController {

    ArrayList<Student> studentsInfo= new ArrayList<>();
    @PostMapping("/add_students")
    public Student create(@RequestBody Student student){

        studentsInfo.add(student);

        return student;

    }
    @RequestMapping(value = "/remove_student",method = RequestMethod.DELETE)
    public String remove(@RequestParam int index){

        studentsInfo.remove(index);

        return "Deleted Successfully";
    }
    @RequestMapping(value = "/update_student",method = RequestMethod.PUT)
    public String  update(@RequestBody Request request){

        int index=request.getIndex();
        Student oldStudent= studentsInfo.get(index);
        Student newStudent= request.getStudent();

        oldStudent.setName(newStudent.getName());
        oldStudent.setAge(newStudent.getAge());
        oldStudent.setRollNo(newStudent.getRollNo());
        oldStudent.setDepartment(newStudent.getDepartment());


        return "Updated Successfully";
    }
    @RequestMapping(value = "/studentsInfo",method = RequestMethod.GET)
    public ArrayList<Student> display(){

        return studentsInfo;
    }
    @RequestMapping(value = "/getUsingRoll",method = RequestMethod.GET)
    public Object findByRollNumber(@RequestParam int roll){
        boolean flag=false;
        ArrayList<Student> found= new ArrayList<>();
        for (Student var : studentsInfo){
            if (var.getRollNo()==roll){
                found.add(var);
                flag=true;
            }

        }

        if (flag){

            return found;
        }
            return "Student not found";

    }

    @RequestMapping(value = "/getInRange",method = RequestMethod.GET)
    public Object findInRange(@RequestParam int from, int to){

        ArrayList<Student> found= new ArrayList<>();
        boolean flag=false;
        for (Student var : studentsInfo){
            if (var.getRollNo()>=from && var.getRollNo()<=to){
                found.add(var);
                flag=true;
            }
        }
        if (flag){
            return found;
        }

        return "Please enter valid range";
    }
    @RequestMapping(value = "/update_new",method = RequestMethod.PUT)
    public String update_new(@RequestParam int index,@RequestParam String name,@RequestParam int age,@RequestParam int roll,@RequestParam String department){

        Student student= studentsInfo.get(index);

        student.setName(name);
        student.setAge(age);
        student.setRollNo(roll);
        student.setDepartment(department);

        return "Updated Successfully";

    }

}
