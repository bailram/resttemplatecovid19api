package com.bailram.resttemplatecovid19api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Resttemplatecovid19apiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Resttemplatecovid19apiApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTempalte() {
		return new RestTemplate();
	}
}
