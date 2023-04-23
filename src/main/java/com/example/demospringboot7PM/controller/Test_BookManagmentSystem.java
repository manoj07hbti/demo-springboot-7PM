package com.example.demospringboot7PM.controller;

import com.example.demospringboot7PM.modal.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Test_BookManagmentSystem {

    ArrayList<Book>books=new ArrayList<>();

    @PostMapping("/book")
    public String bookrequest(@RequestBody Book book){
        books.add(book);
        return "book added sucessesfully...";
    }
    @PostMapping("/books/{name}/{page}/{writer_name}/{subject}")
    public String addbook(@PathVariable String name,@PathVariable int page,@PathVariable String writer_name,@PathVariable String subject){
        Book book=new Book(name,page,writer_name,subject);
        return"Book detail added sucessesfully...";
    }
    @GetMapping("/get_books")
    public ArrayList<Book>getBooks(){
        return books;
    }
    @PutMapping("/update_book/{index}/{name}")
    public String update_data(@PathVariable int index,@PathVariable String name){
        Book book=books.get(index);
        book.setName(name);
        return "book update sucessesfully.."+name;
    }
    @DeleteMapping("/delete_book/{index}")
    public String delete_book(@PathVariable int index){
        books.remove(index);
        return "book deleted sucessesfully...";
    }
}
