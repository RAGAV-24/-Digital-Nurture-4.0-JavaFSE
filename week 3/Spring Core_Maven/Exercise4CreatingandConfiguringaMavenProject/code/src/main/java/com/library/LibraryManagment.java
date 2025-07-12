package com.library;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.library.service.BookService;


@SpringBootApplication
public class LibraryManagment {

	public static void main(String[] args) {
		// SpringApplication.run(LibraryManagment.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml"); 
		BookService bookservice = (BookService) context.getBean("bookService");
		bookservice.addBook("LibraryManagement");


	}

}
