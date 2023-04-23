package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.Model.Library;
import com.example.demospringboot7PM.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryDBController {

    @Autowired
    LibraryService service;
@PostMapping("/Add_Book")
    public String add(@RequestBody Library library){

       service.add(library);

        return "Books add successfully";

    }
    @GetMapping("/Books")
    public List<Library> fetchAllLibrary(){

     return service.fetchAllLibrary();
    }



    @PutMapping("/book/{id}/{addition}")
    public String updateInfo(@PathVariable long id,@PathVariable String addition){

     return service.updateInfo(id,addition);
    }

   @DeleteMapping("/Delete/{id}")
    public String remove(@PathVariable long id){

       return service.removeLibrary(id);
    }






}
