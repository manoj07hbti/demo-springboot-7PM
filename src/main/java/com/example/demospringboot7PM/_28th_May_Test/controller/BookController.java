package com.example.demospringboot7PM._28th_May_Test.controller;

import com.example.demospringboot7PM._28th_May_Test.model.Book;
import com.example.demospringboot7PM._28th_May_Test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){

        return bookService.addBook(book);
    }

    @GetMapping("getAllBook")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @PutMapping("/updateBook/{id}/{name}")
    public String updateBook(@PathVariable long id,@PathVariable String name){

        return bookService.updateName(id,name);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable long id){

        return bookService.deleteBook(id);
    }

    @GetMapping("/getUsingSubject/{subject}")
    public List<Book> getUsingSubject(@PathVariable String subject){
        return bookService.getUsingSubject(subject);
    }

    @GetMapping("/getUsingNameAndSubject")
    public List<Book> getUsingNameAndSubject(@RequestParam String name, @RequestParam String subject){

        return bookService.getUsingNameAndSubject(name,subject);
    }

}
