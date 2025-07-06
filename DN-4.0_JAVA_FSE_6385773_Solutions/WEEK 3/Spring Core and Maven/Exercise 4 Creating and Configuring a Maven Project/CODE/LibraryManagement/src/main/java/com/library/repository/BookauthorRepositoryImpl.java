package com.library.repository;

public class BookauthorRepositoryImpl implements BookauthorRepository {
    @Override
    public void saveAuthorBook(String authorName, String bookTitle) {
        System.out.println("Persisting: " + authorName + " -> " + bookTitle);
    }
}