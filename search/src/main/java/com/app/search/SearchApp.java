package com.app.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SearchApp {

	private static final Logger logger = LoggerFactory.getLogger(SearchApp.class);

	public static void main(String[] args) {
		SpringApplication.run(SearchApp.class, args);
		logger.info("Running...");
	}

}
