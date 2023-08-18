package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = { "com.masai" })
public class AppConfig {

	@Bean
	@Lazy
	public ArtistManagement getSinger() {
		return new Singer();
	}
}
