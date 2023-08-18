package com.masai;

import org.springframework.stereotype.Component;

@Component
public class Singer implements ArtistManagement {

	@Override
	public void announceAvailability(String message) {
		System.out.println(message + " :Available for booking now!");
	}
}
