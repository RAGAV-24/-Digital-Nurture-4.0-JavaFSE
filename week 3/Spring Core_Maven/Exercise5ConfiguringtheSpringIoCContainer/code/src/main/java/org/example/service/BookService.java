package org.example.service;

import org.example.repositroy.BookRepository;

public class BookService {
    public BookService(){
        System.out.println("Book service created");
    }
    private String book;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    private BookRepository bookRepository;

    public void addBook(String bookname) {
        bookRepository.addBook(bookname);
    }

}
