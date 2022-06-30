package com.raquelmichelon.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raquelmichelon.bookstore.dto.MessageResponseDTO;
import com.raquelmichelon.bookstore.entities.Book;
import com.raquelmichelon.bookstore.repositories.BookRepository;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
	
	//metodo que fara o cadastro de livros
	
	private BookRepository bookRepository;
	
	//criar construtor com anotacao
	@Autowired
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	
	@PostMapping()
	public MessageResponseDTO create(@RequestBody Book book) {
		Book savedBook = bookRepository.save(book);
		
		//msg para confirmar criacao do objeto
		return MessageResponseDTO.builder().message("Book created with ID " + savedBook.getId()).build();
	}


}
