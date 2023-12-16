package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.NotFoundException;
import com.masai.model.Booking;
import com.masai.model.User;
import com.masai.repo.BookingRepository;
import com.masai.repo.MovieRepository;
import com.masai.repo.UserRepository;

@Service
public class BookingService {
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BookingRepository bookingRepository;

	public Booking createBooking(Long userId, Booking booking) {
		User user = userRepository.findById(userId).orElseThrow(() -> new NotFoundException("User not found"));

		return bookingRepository.save(booking);
	}

}