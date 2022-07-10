//package com.raquelmichelon.bookstore.controller;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.hamcrest.core.Is;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
//
//import com.raquelmichelon.bookstore.dto.BookDTO;
//import com.raquelmichelon.bookstore.dto.MessageResponseDTO;
//import com.raquelmichelon.bookstore.service.BookService;
//
//@ExtendWith(MockitoExtension.class) //anotacao JUnit5  
//public class BookControllerTest {
//	
//	private MockMvc mockMvc; //Classe do spring para fazer as simulacoes das operacoes no controller
//	
//	@Mock //para simular requisicoes atraves do mockito
//	private BookService bookService;
//	
//	@InjectMocks //ao instanciar um controler ele injeta um objeto de bookservice mock
//	private BookController bookController;
//	
//	
//	//metodo setup para inicializar o objeto mockMvc
//	@BeforeEach
//    void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(bookController)
//                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
//                .setViewResolvers((viewName, locale) -> new MappingJackson2JsonView())
//                .build();
//    }
//
//    @Test
//    void testWhenPOSTisCalledThenABookShouldBeCreated() throws Exception {
//        BookDTO bookDTO = createFakeBookDTO();
//        MessageResponseDTO expectedMessageResponse = MessageResponseDTO.builder()
//                .message("Book created with ID " + bookDTO.getId())
//                .build();
//
//        when(bookService.create(bookDTO)).thenReturn(expectedMessageResponse);
//
//        mockMvc.perform(post(BOOK_API_URL_PATH)
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(asJsonString(bookDTO)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.message", Is.is(expectedMessageResponse.getMessage())));
//    }
//
//    @Test
//    void testWhenPOSTwithInvalidISBNIsCalledThenBadRequestShouldBeReturned() throws Exception {
//        BookDTO bookDTO = createFakeBookDTO();
//        bookDTO.setIsbn("invalid isbn");
//
//        mockMvc.perform(post(BOOK_API_URL_PATH)
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(asJsonString(bookDTO)))
//                .andExpect(status().isBadRequest());
//    }
//	
//
//}
