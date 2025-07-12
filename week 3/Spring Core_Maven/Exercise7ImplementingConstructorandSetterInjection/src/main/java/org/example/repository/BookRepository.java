package org.example.repository;

public class BookRepository {

    public BookRepository() {
        System.out.println("Book Repository created");
    }

    public void addBook(String bookname) {
        System.out.println("Book Added: " + bookname);
    }
}
