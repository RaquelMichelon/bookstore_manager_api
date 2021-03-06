package com.raquelmichelon.bookstore.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
	//expressao regular para validar o formato do isbn / lancar excecao se nao estiver no formato e mostra message para o user
	@Pattern(regexp ="(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$",
    message = "ISBN format must be a valid format")
	private String isbn;
	
	@NotBlank
	@Size(max = 200)
	private String publisherName;
	
	@Valid //bean validation para aplicar todas validacoes nas anotacoes que definimos no projeto
	@NotNull
	private AuthorDTO autor;

}
