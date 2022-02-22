package com.spring.boot.ePharma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.boot")
public class EPharmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EPharmaApplication.class, args);
	}

}
