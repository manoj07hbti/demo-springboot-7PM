package com.example.demospringboot7PM.git;
import com.example.demospringboot7PM.Model.DoctorSystem;
import com.example.demospringboot7PM.Service.DoctorManageSysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DoctorManagementSys {
    @Autowired
    DoctorManageSysService service;
@PostMapping("/doctor")

    public String add(@RequestBody DoctorSystem doctorSystem){

      service.add(doctorSystem);

        return "Doctor add Successfully";
    }
    @GetMapping("/doctors")
    public List<DoctorSystem> fetchAllDoctor(){

      return service.fetchAllDoctor();

    }
    @GetMapping("/doctor/{city}/{dept}")
    public DoctorSystem getDoctorSystem(@PathVariable String city,@PathVariable String dept){

      return service.getDoctorSystem(city, dept);
    }
    @GetMapping("/Doctor/{name}")

    public DoctorSystem getDoctorSystem(@PathVariable String name){

     return service.getDoctorSystem(name);

    }
    @PutMapping("/doctor/{id}/{name}")
    public String updateInfo(@PathVariable long id, @PathVariable String name){


       return service.updateInfo(id,name);
    }
    @DeleteMapping("/Remove/{id}")

   public String remove(@PathVariable long id){

     return service.remove(id);


   }









}

