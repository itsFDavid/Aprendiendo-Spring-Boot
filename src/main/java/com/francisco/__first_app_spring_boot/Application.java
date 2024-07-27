package com.francisco.__first_app_spring_boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	private static Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		log.debug("Mi mensaje debug");
		log.info("Mi mensaje info");
		log.warn("Mi mensaje warn");
		log.error("Mi mensaje error");

	}

}
