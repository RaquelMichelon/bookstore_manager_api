package com.raquelmichelon.bookstore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raquelmichelon.bookstore.dto.BookDTO;
import com.raquelmichelon.bookstore.dto.MessageResponseDTO;
import com.raquelmichelon.bookstore.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
		
	//troquei bookRepository por bookService
	private BookService bookService;
	
	//criar construtor com anotacao para injeção de dependência 
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	
	@PostMapping()
	//alter args para a classe DTO
	//anotation Valid para fazer a validacao correta dos dados de entrada
	public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
		//delegar esse metodo de cadastro de livros para a classe service que eh especifica para regras de negocio
		return bookService.create(bookDTO);
	}

	
}
