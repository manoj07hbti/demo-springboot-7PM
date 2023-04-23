package com.example.demospringboot7PM.Service;

import com.example.demospringboot7PM.Model.Library;
import com.example.demospringboot7PM.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository repository;

    public String add(Library library){

        repository.save(library);

        return "Books Successfully add in Library";
    }
    public List<Library> fetchAllLibrary(){

      return   repository.findAll();
    }

    public String updateInfo(long id,String addition){

       Library library=  repository.getById( id);
        library.setAddition(addition);
        repository.save(library);

        return "update book Successfully";
    }
    public String removeLibrary(long id){

       repository.deleteById(id);

       return "Delete books successfully";

    }

}
