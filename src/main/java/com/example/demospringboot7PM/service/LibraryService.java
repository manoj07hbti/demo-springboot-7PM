package com.example.demospringboot7PM.service;

import com.example.demospringboot7PM.modelClass.Libraries;
import com.example.demospringboot7PM.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository repository;
    public String AddBook(Libraries library){
        repository.save(library);
        return "Book added successfully";
    }
    public List<Libraries>get(){
        return repository.findAll();
    }
    public List<Libraries> getAuthor( String author){
        return repository.findByAuthor(author);
    }
    public Libraries gettitleofbook(String titleofbook){
        return repository.findByTitleofbook(titleofbook);
    }
    public List<Libraries> gettitleandaddition(@PathVariable String titleofbook, @PathVariable String additions){
        return repository.findByTitleofbookAndAdditions(titleofbook,additions);
    }
    public List<Libraries> getcategory(String category){
        return repository.findByCategory(category);
    }
    public String updateidwithtitle(long id, String titleofbook){
        Libraries library= repository.getById(id);
        library.setTitleofbook(titleofbook);
        repository.save(library);
        return "Book title updated successfully";
    }
    public String updateidwithavailabilty(long id, int availability){
        Libraries libraryavailabilty =repository.getById(id);
        libraryavailabilty.setAvailability(availability);
        repository.save(libraryavailabilty);
        return "Book availability updated successfully";
    }
    public String updateidwithauthor(long id, String author){
        Libraries libraryauthor =repository.getById(id);
        libraryauthor.setAuthor(author);
        repository.save(libraryauthor);
        return "Book author updated successfully";
    }
    public String updateidwithaddition(long id, String additions){
        Libraries libraryaddition=repository.getById(id);
        libraryaddition.setAdditions(additions);
        repository.save(libraryaddition);
        return "Book additions updated successfully";
    }
    public String updateidwithcategory(long id, String category){
        Libraries librarycategory=repository.getById(id);
        librarycategory.setCategory(category);
        repository.save(librarycategory);
        return "Book category updated successfully";
    }
    public String deleteid(long id){
        repository.deleteById(id);
        return "Id deleted successfully";
    }
}
