package com.example.demospringboot7PM._28th_May_Test.repository;

import com.example.demospringboot7PM._28th_May_Test.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    public List<Book> findBySubject(String subject);
    public List<Book> findByNameAndSubject(String name,String subject);
}
