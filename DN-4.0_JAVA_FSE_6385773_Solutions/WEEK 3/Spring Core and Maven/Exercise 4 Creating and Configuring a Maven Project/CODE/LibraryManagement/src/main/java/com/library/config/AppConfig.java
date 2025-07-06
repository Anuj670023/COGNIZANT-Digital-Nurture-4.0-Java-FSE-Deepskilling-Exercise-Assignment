package com.library.config;

import com.library.repository.BookauthorRepository;
import com.library.repository.BookauthorRepositoryImpl;
import com.library.service.AuthorService;
import com.library.service.BookService;
import com.library.controller.BookAuthorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BookauthorRepository bookauthorRepository() {
        return new BookauthorRepositoryImpl();
    }

    @Bean
    public AuthorService authorService() {
        AuthorService service = new AuthorService();
        service.setBookauthorRepository(bookauthorRepository());
        return service;
    }

    @Bean
    public BookService bookService() {
        BookService service = new BookService();
        service.setBookauthorRepository(bookauthorRepository());
        return service;
    }

    @Bean
    public BookAuthorController bookAuthorController() {
        BookAuthorController controller = new BookAuthorController();
        controller.setAuthorService(authorService());
        controller.setBookService(bookService());
        return controller;
    }
}