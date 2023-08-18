package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masai.model.Event;
import com.masai.model.User;
import com.masai.service.EventService;
import com.masai.service.UserService;

@Controller
public class EventUserController {
	@Autowired
	private EventService eventService;

	@Autowired
	private UserService userService;

	@PostMapping("/events")
	@ResponseBody
	public Event createEvent(@RequestBody Event event) {
		return eventService.addNewEvent(event);
	}

	@PutMapping("/events/{eventId}")
	@ResponseBody
	public Event updateEvent(@PathVariable Long eventId, @RequestBody Event event) {
		return eventService.updateEvent(eventId, event);
	}

	@GetMapping("/events/{eventName}/users")
	@ResponseBody
	public List<User> getUsersByEventName(@PathVariable String eventName) {
		return eventService.getRegisteredUsersByEventName(eventName);
	}

	@PostMapping("/users")
	@ResponseBody
	public User createUser(@RequestBody User user) {
		return userService.addNewUser(user);
	}

	@PostMapping("/users/{userId}/events/{eventId}")
	@ResponseBody
	public User registerUserForEvent(@PathVariable Long userId, @PathVariable Long eventId) {
		return userService.registerUserForEvent(userId, eventId);
	}

	@DeleteMapping("/users/{userId}/events/{eventId}")
	@ResponseBody
	public User cancelEventRegistration(@PathVariable Long userId, @PathVariable Long eventId) {
		return userService.cancelEventRegistration(userId, eventId);
	}

	@GetMapping("/users/{userName}/events")
	@ResponseBody
	public List<Event> getEventsByUsername(@PathVariable String userName) {
		return userService.getEventsByUsername(userName);
	}
}
