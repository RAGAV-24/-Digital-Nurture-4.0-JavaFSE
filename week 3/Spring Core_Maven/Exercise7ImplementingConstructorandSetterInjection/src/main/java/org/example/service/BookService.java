package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private String book;
    private BookRepository bookRepository;

    // Constructor for constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor injection used");
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter injection used");
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void addBook(String bookname) {
        bookRepository.addBook(bookname);
    }
}
