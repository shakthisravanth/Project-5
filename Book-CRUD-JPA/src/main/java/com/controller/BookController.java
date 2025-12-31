package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Book;
import com.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private BookService service;

	@GetMapping
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}

	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return service.addBook(book);
	}

	@GetMapping("/{id}")
	public Book getBook(@PathVariable Long id) {
		return service.getBookById(id);
	}

	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
		return service.updateBook(id, book);
	}

	@DeleteMapping("/{id}")
	public boolean deleteBook(@PathVariable Long id) {
		return service.deleteBook(id);
	}
	
}
