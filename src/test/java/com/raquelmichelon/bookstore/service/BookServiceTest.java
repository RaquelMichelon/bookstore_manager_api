//package com.raquelmichelon.bookstore.service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.raquelmichelon.bookstore.dto.BookDTO;
//import com.raquelmichelon.bookstore.repositories.BookRepository;
//
//@ExtendWith(MockitoExtension.class)
//public class BookServiceTest {
//
//    @Mock
//    private BookRepository bookRepository;
//
//    @InjectMocks
//    private BookService bookService;
//
//    @Test
//    void whenGivenExistingIdThenReturnThisBook() throws BookNotFoundException {
//        Book expectedFoundBook = createFakeBook();
//
//        when(bookRepository.findById(expectedFoundBook.getId())).thenReturn(Optional.of(expectedFoundBook));
//
//        BookDTO bookDTO = bookService.findById(expectedFoundBook.getId());
//
//        assertEquals(expectedFoundBook.getName(), bookDTO.getName());
//        assertEquals(expectedFoundBook.getIsbn(), bookDTO.getIsbn());
//        assertEquals(expectedFoundBook.getPublisherName(), bookDTO.getPublisherName());
//    }
//
//    @Test
//    void whenGivenUnexistingIdThenNotFindThrowAnException() {
//        var invalidId = 10L;
//
//        when(bookRepository.findById(invalidId))
//                .thenReturn(Optional.ofNullable(any(Book.class)));
//
//        assertThrows(BookNotFoundException.class, () -> bookService.findById(invalidId));
//    }
//}
