package com.library.service;

import com.library.repository.BookRepository;

public class Bookservice {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void display() {
        
        System.out.println("In Bookservice display method");
        bookRepository.displaymethod();
    }
}
