package com.example.demospringboot7PM.Service;


import com.example.demospringboot7PM.Model.DoctorSystem;
import com.example.demospringboot7PM.repository.DoctorSysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Service
public class DoctorManageSysService {
    @Autowired
    DoctorSysRepository repository;

    public String add(DoctorSystem doctorSystem){

        repository.save(doctorSystem);

        return "Doctor add successfully";
    }

    public List<DoctorSystem> fetchAllDoctor(){
       return repository.findAll();

    }
    public String updateInfo(long id,String name){

          DoctorSystem doctorSystem =repository.getById(id);

           doctorSystem.setName(name);

           repository.save(doctorSystem);

           return "Doctor have been update successfully";
    }

    public String remove(long id){

        repository.deleteById(id);

        return "delete data successfully";
    }
    public DoctorSystem getDoctorSystem(String city,String dept){

        return repository.findByCityAndDept(city,dept);
    }

    public DoctorSystem getDoctorSystem(String name){

        return repository.findByName(name);
    }


}
