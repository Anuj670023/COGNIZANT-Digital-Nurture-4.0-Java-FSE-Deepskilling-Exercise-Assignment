package com.library.service;

import com.library.repository.BookauthorRepository;

public class AuthorService {  // Changed class name to PascalCase
    private BookauthorRepository bookauthorRepository;

    public void setBookauthorRepository(BookauthorRepository repo) {
        this.bookauthorRepository = repo;
    }

    public void registerAuthor(String authorName) {
        System.out.println("Registering author: " + authorName);
    }
}