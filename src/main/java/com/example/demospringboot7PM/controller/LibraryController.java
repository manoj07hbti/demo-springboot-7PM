package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.modelClass.Libraries;
import com.example.demospringboot7PM.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    LibraryService service;
    @PostMapping("/Addbook")
    public String AddBook(@RequestBody Libraries library){
        service.AddBook(library);
        return "Book added successfully";
    }
    @GetMapping("/Library read")
    public List<Libraries>get(){
        return service.get();
    }
    @GetMapping("/Author/{author}")
    public List<Libraries> getAuthor(@PathVariable String author){
        return service.getAuthor(author);
    }
    @GetMapping("/titleofbooks/{titleofbook}")
    public Libraries gettitleofbook(@PathVariable String titleofbook){
        return service.gettitleofbook(titleofbook);
    }
    @GetMapping("/titleofbook addtitions/{titleofbook}/{additions}")
    public List<Libraries> gettitleandaddition(@PathVariable String titleofbook,@PathVariable String additions){
        return service.gettitleandaddition(titleofbook,additions);
    }
    @GetMapping("/categorys/{category}")
    public List<Libraries> getcategory(@PathVariable String category){
        return service.getcategory(category);
    }
    @PutMapping("/updatewithtitle/{id}/{titleofbook}")
    public String updateidwithtitle(@PathVariable long id, @PathVariable String titleofbook){
        service.updateidwithtitle(id, titleofbook);
        return "Book title updated successfully";
    }
    @PutMapping("/updatewithavailability/{id}/{availability}")
    public String updateidwithavailabilty(@PathVariable long id, @PathVariable int availability){
        service.updateidwithavailabilty(id, availability);
        return "Book availability updated successfully";
    }
    @PutMapping("/updateidwithauthor/{id}/{author}")
    public String updateidwithauthor(@PathVariable long id,@PathVariable String author){
        service.updateidwithauthor(id, author);
        return "Book author updated successfully";
    }
    @PutMapping("/updateidwithaddition/{id}/{additions}")
    public String updateidwithaddition(@PathVariable long id, @PathVariable String additions){
        service.updateidwithaddition(id, additions);
        return "Book additions updated successfully";
    }
    @PutMapping("/updateidwithcategory/{id}/{category}")
    public String updateidwithcategory(@PathVariable long id, @PathVariable String category){
        service.updateidwithcategory(id, category);
        return "Book category updated successfully";
    }
    @DeleteMapping("/removeid/{id}")
    public String deleteid(@PathVariable long id){
        service.deleteid(id);
        return "Id deleted successfully";
    }


}
