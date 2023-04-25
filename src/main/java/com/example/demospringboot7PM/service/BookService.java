package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.modal.Book;
import com.example.demospringboot7PM.repository.Bookrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired

    Bookrepository repository;

    public String  add(Book book) {
        repository.save(book);
        return "Book added Sucessesfully..";
    }
}
