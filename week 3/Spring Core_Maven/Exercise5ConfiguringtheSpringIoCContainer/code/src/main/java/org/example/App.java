package org.example;

import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        BookService bookservice = (BookService) context.getBean("bookservice");
        bookservice.addBook("spring Boot");
    }
}
