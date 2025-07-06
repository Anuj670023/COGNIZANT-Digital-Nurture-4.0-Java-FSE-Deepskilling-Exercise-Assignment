package com.library.service;

import com.library.repository.BookauthorRepository;

public class BookService {
    private BookauthorRepository bookauthorRepository;

    public void setBookauthorRepository(BookauthorRepository repo) {
        this.bookauthorRepository = repo;
    }

    public void addBook(String bookTitle, String authorName) {
        System.out.println("Adding book: " + bookTitle);
        bookauthorRepository.saveAuthorBook(authorName, bookTitle);
    }
}