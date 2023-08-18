package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class EventOrganizerImpl implements EventOrganizer {

	private ArtistManagement artistManagement;

	@Autowired
	public EventOrganizerImpl(@Qualifier("getSinger") ArtistManagement artistManagement) {
		this.artistManagement = artistManagement;
	}

	@Override
	public void findArtist(String message) {
		this.artistManagement.announceAvailability(message);
	}

	@PostConstruct
	public void postConstructMethod() {
		System.out.println("Event is on 24-05-2023 at Kanpur");
	}

	@PreDestroy
	public void preDestroyMethod() {
		System.out.println("Thankyou for Attending the Event");
	}
}
