package com.es.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.es.model.Book;
import com.es.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookservice;
	
	@PostMapping("/save")
	public Book save(Book book) {
		return bookservice.save(book);	
	}
	
	@GetMapping("/findall")
	public Iterable<Book> findAll(){
		return bookservice.findAll();
	}
	
	
	@GetMapping("findby/{author}")
	public List<Book> findByAuthor(@PathVariable String author) {
		return bookservice.findByAuthor(author);
	}
	
	@GetMapping("findby/{title}")
	public List<Book> findByTitle(@PathVariable String title) {
		return bookservice.findByAuthor(title);
	}
}
