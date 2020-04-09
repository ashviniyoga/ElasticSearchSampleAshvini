package com.es.repository;

import java.util.List;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.es.model.Book;

public interface BookRepository extends ElasticsearchRepository<Book, String> {

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

	Book findOne(String id);

}