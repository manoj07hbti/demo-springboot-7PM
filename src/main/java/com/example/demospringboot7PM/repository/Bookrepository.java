package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.modal.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository<Book,Long> {

    public Book findByIdAndName (Long id,String Name);
}
