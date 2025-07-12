package com.library;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.Bookservice;

@SpringBootApplication
public class Exercise2ImplementingDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Bookservice bookservice = (Bookservice) context.getBean("bookService");
		bookservice.display();

	}

}
