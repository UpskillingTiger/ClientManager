package com.upskilling.clientmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.upskilling.controller" })
public class ClientManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientManagerApplication.class, args);
	}

}
