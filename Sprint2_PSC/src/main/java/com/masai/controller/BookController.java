package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.NoBookFoundException;
import com.masai.model.Book;

import jakarta.annotation.PostConstruct;

@RestController
public class BookController {

	private List<Book> books;

	@PostConstruct
	public void init() {
		books = new ArrayList<Book>();
		System.out.println("Creating list of Books : ");
		books.add(new Book(1, "Harry Potter", 450));
		books.add(new Book(2, "Narnia", 500));
		books.add(new Book(3, "Twilight", 750));
		books.add(new Book(4, "Song of Ice and Fire", 1000));
		books.add(new Book(5, "Dark Horse", 400));
		books.add(new Book(6, "Rich dad poor dad", 800));
	}

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBook() {
		if (books.size() == 0) {
			throw new NoBookFoundException("List Is Empty.");
		}

		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}

	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id) {
		List<Book> book = books.stream().filter(b -> b.getId() == id).toList();
		if (book.size() == 0) {
			return new ResponseEntity<Book>(new Book(), HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Book>(book.get(0), HttpStatus.OK);
	}
}
