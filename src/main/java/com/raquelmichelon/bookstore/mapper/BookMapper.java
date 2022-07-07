package com.raquelmichelon.bookstore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.raquelmichelon.bookstore.dto.BookDTO;
import com.raquelmichelon.bookstore.entities.Book;

@Mapper
public interface BookMapper {
	
	//para instanciar o mapper dentro da interface e a interface ser criada atraves de uma unica constante
	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);


	//de dto para entidade seguindo exatamente essas convencoes
	Book toModel(BookDTO bookDTO);
	
	
	// de entidade para dto seguindo exatamente essas convencoes
	BookDTO toDTO(Book book);

}
