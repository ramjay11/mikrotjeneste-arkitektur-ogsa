package com.ramjava.bruker.tjeneste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BrukerTjenesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrukerTjenesteApplication.class, args);
	}
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
