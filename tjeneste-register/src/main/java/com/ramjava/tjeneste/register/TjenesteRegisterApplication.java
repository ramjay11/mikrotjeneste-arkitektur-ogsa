package com.ramjava.tjeneste.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TjenesteRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TjenesteRegisterApplication.class, args);
	}

}
