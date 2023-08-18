package com.masai;

import org.springframework.stereotype.Component;

@Component
public class Dancer implements ArtistManagement {

	@Override
	public void announceAvailability(String message) {
		System.out.println(message + " :Available for booking now!");
	}
}
