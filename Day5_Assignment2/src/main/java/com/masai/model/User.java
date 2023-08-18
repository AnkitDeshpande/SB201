package com.masai.model;

import java.util.List;

public class User {
	private Long userId;
	private String userName;
	private String userEmail;
	private List<Event> registeredEvents;

	// Getters and setters
	public User(Long userId, String userName, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<Event> getRegisteredEvents() {
		return registeredEvents;
	}

	public void setRegisteredEvents(List<Event> registeredEvents) {
		this.registeredEvents = registeredEvents;
	}

}