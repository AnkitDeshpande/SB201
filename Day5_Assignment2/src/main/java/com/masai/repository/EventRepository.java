package com.masai.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.masai.model.Event;
import com.masai.model.User;

@Repository
public class EventRepository {
	private Map<Long, Event> eventMap = new HashMap<>();

	public Event save(Event event) {
		eventMap.put(event.getEventId(), event);
		return event;
	}

	public Event findById(Long eventId) {
		return eventMap.get(eventId);
	}

	public List<Event> findAll() {
		return new ArrayList<>(eventMap.values());
	}

	public void update(Event event) {
		eventMap.put(event.getEventId(), event);
	}

	public void deleteById(Long eventId) {
		eventMap.remove(eventId);
	}

	public List<User> getRegisteredUsersByEventName(String eventName) {
		return null;
	}
}
