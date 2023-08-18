package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Event;
import com.masai.model.User;
import com.masai.repository.EventRepository;
import com.masai.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EventRepository eventRepository;

	public User addNewUser(User user) {
		return userRepository.save(user);
	}

	public User registerUserForEvent(Long userId, Long eventId) {
		User user = userRepository.findById(userId);
		Event event = eventRepository.findById(eventId);

		if (user != null && event != null) {
			user.getRegisteredEvents().add(event);
			userRepository.update(user);
		}
		return user;
	}

	public User cancelEventRegistration(Long userId, Long eventId) {
		User user = userRepository.findById(userId);
		Event event = eventRepository.findById(eventId);

		if (user != null && event != null) {
			user.getRegisteredEvents().remove(event);
			userRepository.update(user);
		}
		return user;
	}

	public List<Event> getEventsByUsername(String username) {
		return userRepository.getEventsByUsername(username);
	}
}