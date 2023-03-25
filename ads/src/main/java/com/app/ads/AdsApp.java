package com.app.ads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdsApp {

	private static final Logger logger = LoggerFactory.getLogger(AdsApp.class);

	public static void main(String[] args) {
		SpringApplication.run(AdsApp.class, args);
		logger.info("Running...");
	}

}
