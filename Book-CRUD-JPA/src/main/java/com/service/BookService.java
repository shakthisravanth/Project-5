package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Book;
import com.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	public Book addBook(Book book) {
		return repository.save(book);
	}

	public Book getBookById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public Book updateBook(Long id, Book updatedBook) {
		Optional<Book> optional = repository.findById(id);
		if (optional.isEmpty())
			return null;

		Book book = optional.get();
		book.setName(updatedBook.getName());
		book.setPrice(updatedBook.getPrice());
		book.setAvailable(updatedBook.isAvailable());

		return repository.save(book);
	}

	public boolean deleteBook(Long id) {
		if (!repository.existsById(id))
			return false;
		repository.deleteById(id);
		return true;
	}
}
