package com.raquelmichelon.bookstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //anotacao jpa para mapear entidade/uma tabela do nosso db
public class Author {
	
	@Id //primary-key
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true) //valor do campo nao deve ser nulo nem igual a outro ja existente
	private String name;
	
	@Column(nullable = false)
	private Integer age;

}
