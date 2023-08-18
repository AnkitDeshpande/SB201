package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.MissingParam;
import com.example.demo.exception.NoBookByIdException;
import com.example.demo.exception.NoBookInPriceRangeException;
import com.example.demo.model.Book;

import jakarta.annotation.PostConstruct;

@RestController
public class BookController {
	
	private List<Book> books = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		System.out.println("Creating list of Books : ");
		books.add(new Book(1,"Harry Potter", 450));
		books.add(new Book(2,"Narnia", 500));
		books.add(new Book(3,"Twilight", 750));
		books.add(new Book(4,"Song of Ice and Fire", 1000));
		books.add(new Book(5,"Dark Horse", 400));
		books.add(new Book(6,"Rich dad poor dad", 800));
	}
	
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Integer id){
		
		List<Book> bookById = books.stream().filter(b->b.getId()==id).toList();
		if(bookById.size()==0) {
			throw new NoBookByIdException("Book Not found with ID : "+id);

		}
		
		return new ResponseEntity<Book>(bookById.get(0), HttpStatus.OK);
	}
	
	@GetMapping("books")
	public ResponseEntity<List<Book>> getBookInPriceRange(@RequestParam Integer lower, Integer higher){
		
		if(lower==null || higher == null) {
			throw new MissingParam("One or more parameter is missing : required [ lower(int), higher(int)]");
		}

		List<Book> bookInPriceRange = books.stream().filter(b->b.getPrice() >= lower && b.getPrice()<= higher).toList();
		
		if(bookInPriceRange.size()==0) {
			throw new NoBookInPriceRangeException("No Book in range from "+lower+" to "+ higher);
		}
		
		return new ResponseEntity<List<Book>>(bookInPriceRange, HttpStatus.OK);
	}

}
