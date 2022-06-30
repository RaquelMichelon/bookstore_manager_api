package com.raquelmichelon.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raquelmichelon.bookstore.dto.MessageResponseDTO;
import com.raquelmichelon.bookstore.entities.Book;
import com.raquelmichelon.bookstore.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
		
	//troquei bookRepository por bookService
	private BookService bookService;
	
	//criar construtor com anotacao
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	
	@PostMapping()
	public MessageResponseDTO create(@RequestBody Book book) {
		//delegar esse metodo de cadastro de livros para a classe service
		return bookService.create(book);
	}



}
