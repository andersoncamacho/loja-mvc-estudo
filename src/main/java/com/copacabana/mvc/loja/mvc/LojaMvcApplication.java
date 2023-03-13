package com.copacabana.mvc.loja.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class LojaMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaMvcApplication.class, args);
	}

}
