package com.example.demospringboot7PM.testof28;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBook extends JpaRepository<ModelBook, Long> {

    List<ModelBook> findByname(String name);
    List<ModelBook> findBysub(String sub);
}
