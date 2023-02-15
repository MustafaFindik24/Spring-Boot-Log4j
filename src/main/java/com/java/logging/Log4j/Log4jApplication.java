package com.java.logging.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Log4jApplication.class, args);
	}

}

	/*public static void main(String[] args) {
		PropertyConfigurator.configure("src/main/resources/log4j.properties");

	}*/
