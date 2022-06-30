package com.raquelmichelon.bookstore.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data         //para add getters setters equals e hashCode
@Builder      //para construir objetos de forma segura
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
	
	private Long id;
	
	@NotBlank //Bean Validation - campo nao pode ser vazio
	@Size(max = 200) //Bean Validation - tam maximo de 200 caracteres
	private String name;
	
	@NotNull //Bean Validation
	@Size(max = 100) ////Bean Validation
	private Integer age;

}
