package com.raquelmichelon.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raquelmichelon.bookstore.dto.BookDTO;
import com.raquelmichelon.bookstore.dto.MessageResponseDTO;
import com.raquelmichelon.bookstore.entities.Book;
import com.raquelmichelon.bookstore.mapper.BookMapper;
import com.raquelmichelon.bookstore.repositories.BookRepository;

@Service 
public class BookService {
	
	private BookRepository bookRepository;
	
	//instanciacao bookmapper
	private final BookMapper bookMapper = BookMapper.INSTANCE;

	//anotação para fazer a injeção de dependência
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	//copy and past do método em BookController removendo anotaçoes de requisicao
	public MessageResponseDTO create(BookDTO bookDTO) {
		
		//entidade Book para salvar no BD para isso pode-se usar metodo builder do Lombok
		//ou a lib MapStruct que eh o nosso caso
		Book bookToSave = bookMapper.toModel(bookDTO);
		
		//em vez de passar um bookDTO para o DB vamos passar um booktosave
		Book savedBook = bookRepository.save(bookToSave);
		
		//msg para confirmar criacao do objeto
		return MessageResponseDTO.builder().message("Book created with ID " + savedBook.getId()).build();
	}

}
