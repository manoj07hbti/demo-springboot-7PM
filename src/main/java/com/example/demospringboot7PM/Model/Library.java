package com.example.demospringboot7PM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="Library_DB")
public class Library {
// we should use data

     @Id
     @GeneratedValue
     long id;
     String Category;
     String Addition;
     String title_of_the_book;
     String Author;

     // default constructor

    public Library() {
    }

    // Constructor
    public Library(String category, String addition, String title_of_the_book, String author) {
        Category = category;
        Addition = addition;
        this.title_of_the_book = title_of_the_book;
        Author = author;
    }

    // we should use getter setter

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getAddition() {
        return Addition;
    }

    public void setAddition(String addition) {
        Addition = addition;
    }

    public String getTitle_of_the_book() {
        return title_of_the_book;
    }

    public void setTitle_of_the_book(String title_of_the_book) {
        this.title_of_the_book = title_of_the_book;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
