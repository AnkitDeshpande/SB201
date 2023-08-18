package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Event;
import com.masai.model.User;
import com.masai.repository.EventRepository;

@Service
public class EventService {
	@Autowired
	private EventRepository eventRepository;

	public Event addNewEvent(Event event) {
		return eventRepository.save(event);
	}

	public Event updateEvent(Long eventId, Event event) {
		Event existingEvent = eventRepository.findById(eventId);
		if (existingEvent != null) {
			existingEvent.setEventName(event.getEventName());
			existingEvent.setEventDate(event.getEventDate());
			existingEvent.setEventVenue(event.getEventVenue());
			eventRepository.update(existingEvent);
		}
		return existingEvent;
	}

	public List<User> getRegisteredUsersByEventName(String eventName) {
		return eventRepository.getRegisteredUsersByEventName(eventName);
	}
}