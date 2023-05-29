package com.example.demospringboot7PM.testof28;

import com.example.demospringboot7PM.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBook {
    @Autowired
    RepositoryBook repository;
    public String AddbookData(ModelBook book){
        repository.save(book);
        return "Successfully Added book data";

    }
    public List<ModelBook> getBookData(){
        return repository.findAll();
    }
    public List<ModelBook> getBookDatabyname(String name){
        return repository.findByname(name);
    }
    public List<ModelBook> getBookDatabysub(String sub){
        return repository.findBysub(sub);
    }
    public String updateNamedata(long id, String name){
        ModelBook book =repository.getById(id);
        book.setName(name);
        repository.save(book);
        return "Successfully update name";
    }
    public String updateSubdata(long id, String sub){
        ModelBook book =repository.getById(id);
        book.setName(sub);
        repository.save(book);
        return "Successfully update sub";
    }
    public String deleteData(long id){
        repository.deleteById(id);
        return "delete book data successfully";
    }
}
