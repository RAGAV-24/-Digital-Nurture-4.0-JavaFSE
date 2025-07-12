package com.library.repository;


public class BookRepository {
    public BookRepository(){
        System.out.println("BookRepository created");
    }
    public void saveBook(String bookName) {
        System.out.println("Book saved: " + bookName);
    }
}