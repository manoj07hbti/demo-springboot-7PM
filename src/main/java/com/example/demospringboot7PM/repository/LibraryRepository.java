package com.example.demospringboot7PM.repository;

import com.example.demospringboot7PM.modelClass.Libraries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibraryRepository extends JpaRepository<Libraries, Long>{

    public List<Libraries> findByAuthor(String author);
     public Libraries findByTitleofbook(String titleofbook);
     public List<Libraries> findByTitleofbookAndAdditions(String titleofbook, String additions);
     public List<Libraries> findByCategory(String category);


}
