package com.example.demospringboot7PM.testof28;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerBook {
    @Autowired
    ServiceBook service;
    @PostMapping("/Abook")
    public String add(@RequestBody ModelBook book){
        service.AddbookData(book);
        return "Successfully Added book data";
    }
    @GetMapping("/Bbook")
    public List<ModelBook> get(){
        return service.getBookData();
    }
    @GetMapping("/Cgetname/{name}")
    public List<ModelBook>getbyname(@PathVariable String name){
        return service.getBookDatabyname(name);
    }
    @GetMapping("/Dgetsub/{sub}")
    public List<ModelBook>getbysub(@PathVariable String sub){
        return service.getBookDatabysub(sub);
    }
    @PutMapping("/Eupdatename/{id}/{name}")
    public String updatename(@PathVariable long id, @PathVariable String name){
        service.updateNamedata(id,name);
        return "Successfully update name";
    }
    @PutMapping("/Fupdatesub/{id}/{sub}")
    public String updatesub(@PathVariable long id, @PathVariable String sub){
        service.updateSubdata(id, sub);
        return "Successfully update sub";
    }
    @DeleteMapping("/Gdelete/{id}")
    public String delete(@PathVariable long id){
        service.deleteData(id);
        return "delete book data successfully";
    }
}





