package com.masai.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.masai"})
public class Day7Application {

	public static void main(String[] args) {
		SpringApplication.run(Day7Application.class, args);
	}

}
