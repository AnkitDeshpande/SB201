package com.masai;

import org.springframework.stereotype.Component;

@Component
class Actor implements ArtistManagement {

	@Override
	public void announceAvailability(String message) {
		System.out.println(message + " :Available for booking now!");
	}
}