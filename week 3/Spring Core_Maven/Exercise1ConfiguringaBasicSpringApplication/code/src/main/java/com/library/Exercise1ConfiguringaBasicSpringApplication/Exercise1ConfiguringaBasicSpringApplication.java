package com.library.Exercise1ConfiguringaBasicSpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.Exercise1ConfiguringaBasicSpringApplication.BookRepository.BookRepository;
import com.library.Exercise1ConfiguringaBasicSpringApplication.Bookservice.Bookservice;

@SpringBootApplication
public class Exercise1ConfiguringaBasicSpringApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Bookservice bookservice =  (Bookservice) context.getBean("bookservice");
		BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
		bookservice.setbookRepository(bookRepository);
		bookservice.addbook("Spring in Action");
	}
}
