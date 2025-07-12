package com.library.Exercise1ConfiguringaBasicSpringApplication.Bookservice;

import com.library.Exercise1ConfiguringaBasicSpringApplication.BookRepository.BookRepository;

public class Bookservice {
    private BookRepository bookRepository;

    public void setbookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addbook(String bookname) {
        System.out.println("Adding book: " + bookname);
        bookRepository.saveBook(bookname);
    }
}
