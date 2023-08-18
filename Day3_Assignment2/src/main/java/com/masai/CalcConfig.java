package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalcConfig {

	@Bean
	public Calculator calculator() {
		return new Calculator();
	}
}
