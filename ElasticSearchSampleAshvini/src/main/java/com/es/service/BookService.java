package com.es.service;


import java.util.List;

import com.es.model.Book;

public interface BookService {

    Book save(Book book);

    void delete(Book book);

    Book findOne(String id);

    Iterable<Book> findAll();

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

}