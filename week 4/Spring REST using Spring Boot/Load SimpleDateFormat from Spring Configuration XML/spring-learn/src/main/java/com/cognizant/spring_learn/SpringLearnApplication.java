package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringLearnApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		DisplayDate displayDate = context.getBean("displaydate", DisplayDate.class);
		displayDate.display();


	}

}
