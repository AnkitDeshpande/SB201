package com.masai.model;

import java.time.LocalDate;
import java.util.List;

public class Event {
	private Long eventId;
	private String eventName;
	private LocalDate eventDate;
	private String eventVenue;
	private List<User> registeredUsers;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(Long eventId, String eventName, LocalDate eventDate, String eventVenue) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventVenue = eventVenue;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventVenue() {
		return eventVenue;
	}

	public void setEventVenue(String eventVenue) {
		this.eventVenue = eventVenue;
	}

	public List<User> getRegisteredUsers() {
		return registeredUsers;
	}

	public void setRegisteredUsers(List<User> registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

}