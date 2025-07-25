package com.library.controller;

import com.library.service.AuthorService;
import com.library.service.BookService;

public class BookAuthorController {
    private BookService bookService;
    private AuthorService authorService;

    public void setBookService(BookService service) {
        this.bookService = service;
    }

    public void setAuthorService(AuthorService service) {
        this.authorService = service;
    }

    public void processNewBook(String authorName, String bookTitle) {
        authorService.registerAuthor(authorName);
        bookService.addBook(bookTitle, authorName);
        System.out.println("Process completed for " + bookTitle);
    }
}