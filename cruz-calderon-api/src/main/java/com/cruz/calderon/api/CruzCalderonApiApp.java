package com.cruz.calderon.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cruz.calderon")
public class CruzCalderonApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CruzCalderonApiApp.class, args);
	}

}