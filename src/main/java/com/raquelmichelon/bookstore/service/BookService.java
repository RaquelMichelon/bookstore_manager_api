package com.raquelmichelon.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raquelmichelon.bookstore.dto.MessageResponseDTO;
import com.raquelmichelon.bookstore.entities.Book;
import com.raquelmichelon.bookstore.repositories.BookRepository;

@Service 
public class BookService {
	
	private BookRepository bookRepository;

	//construtor para fazer a injeção de dependência
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	//copy and past do método em BookController removendo anotaçoes de requisicao
	public MessageResponseDTO create(Book book) {
		Book savedBook = bookRepository.save(book);
		
		//msg para confirmar criacao do objeto
		return MessageResponseDTO.builder().message("Book created with ID " + savedBook.getId()).build();
	}

}
