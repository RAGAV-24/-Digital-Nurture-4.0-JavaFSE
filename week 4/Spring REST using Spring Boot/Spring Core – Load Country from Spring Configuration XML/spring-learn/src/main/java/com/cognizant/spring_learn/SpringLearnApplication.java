	package com.cognizant.spring_learn;

	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.slf4j.LoggerFactory;
	import org.slf4j.Logger;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	@SpringBootApplication
	public class SpringLearnApplication {


		private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);


		public static  void main(String []args){
				LOGGER.debug("INSIDE MAIN FUNCTION");
				displayCountry();
		}
		public static void displayCountry() {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
			Country country = context.getBean("country", Country.class);
			LOGGER.debug("Country : {}", country.toString());
			context.close();
		}

	}
