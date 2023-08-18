package com.masai.ui;

import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class DemoController {

	@PostConstruct
	public void init() {
		System.out.println("Hello world.");
	}
}
