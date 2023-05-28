package com.example.demospringboot7PM._28th_May_Test.service;

import com.example.demospringboot7PM._28th_May_Test.model.Book;
import com.example.demospringboot7PM._28th_May_Test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

public String addBook(Book book){

    bookRepository.save(book);

    return "Book Added successfully";
}


    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }



    public String updateName(long id,String name){
        Book book=bookRepository.getById(id);

        book.setName(name);
        bookRepository.save(book);
        return "Book updated successfully as :"+name;
    }

    public String deleteBook(long id){

        bookRepository.deleteById(id);
        return "Book deleted successfully";
    }

    public List<Book> getUsingSubject(String subject){

        return bookRepository.findBySubject(subject);
    }

    public List<Book> getUsingNameAndSubject(String name, String subject){

        return bookRepository.findByNameAndSubject(name,subject);
    }

}
