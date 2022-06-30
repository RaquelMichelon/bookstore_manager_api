package com.raquelmichelon.bookstore.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.raquelmichelon.bookstore.entities.Author;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data         //para add getters setters equals e hashCode
@Builder      //para construir objetos de forma segura
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
	
	private Long id;

	@NotBlank
	@Size(max = 200)
	private String name;
	
	@NotNull
	private Integer pages;
	
	@NotNull
	private Integer chapters;
	
	@NotBlank
	@Size(max = 100)
	private String isbn;
	
	private String publisherName;
	
	private Author autor;

}
