package com.raquelmichelon.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raquelmichelon.bookstore.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
