package com.masai.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.masai.model.Event;
import com.masai.model.User;
import com.masai.repository.EventRepository;
import com.masai.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "com.masai") // Replace with the actual package name
public class AppConfig {

	@Bean
	public EventRepository eventRepository() {
		return new EventRepository();
	}

	@Bean
	public UserRepository userRepository() {
		return new UserRepository();
	}

	@PostConstruct
	public void initializeData() {
		// Populate event and user repositories with sample hardcoded data
		EventRepository eventRepository = eventRepository();
		UserRepository userRepository = userRepository();

		Event event1 = new Event(1L, "Sample Event 1", LocalDate.of(2023, 8, 10), "Venue 1");
		Event event2 = new Event(2L, "Sample Event 2", LocalDate.of(2023, 8, 15), "Venue 2");
		Event event3 = new Event(3L, "Sample Event 3", LocalDate.of(2023, 8, 20), "Venue 3");

		eventRepository.save(event1);
		eventRepository.save(event2);
		eventRepository.save(event3);

		User user1 = new User(1L, "John Doe", "john@example.com");
		User user2 = new User(2L, "Jane Smith", "jane@example.com");
		User user3 = new User(3L, "Michael Johnson", "michael@example.com");

		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);
	}

}
