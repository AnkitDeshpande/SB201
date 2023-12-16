package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Booking;
import com.masai.model.Movie;
import com.masai.model.User;
import com.masai.service.BookingService;
import com.masai.service.CinemaHallService;
import com.masai.service.MovieService;
import com.masai.service.ScreenService;
import com.masai.service.UserService;

@RestController
public class UserController {
	@Autowired
	private CinemaHallService cinemaHallService;
	@Autowired
	private ScreenService screenService;
	@Autowired
	private MovieService movieService;
	@Autowired
	private UserService userService;
	@Autowired
	private BookingService bookingService;

	@PostMapping
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		return null;
	}

	@PostMapping("/{userId}/bookings")
	public ResponseEntity<Booking> createBooking(@PathVariable Long userId, @RequestBody Booking booking) {
		return new ResponseEntity<Booking>(bookingService.createBooking(userId, booking), HttpStatus.CREATED);
	}

	@PutMapping("/bookings/{bookingId}/movies")
	public ResponseEntity<Booking> addMovieToBooking(@PathVariable Long bookingId, @RequestBody Movie movie) {
		return null;
	}

	@PutMapping("/bookings/{bookingId}")
	public ResponseEntity<Booking> updateBooking(@PathVariable Long bookingId, @RequestBody Booking booking) {
		return null;
	}

	@GetMapping("/{userId}/bookings")
	public ResponseEntity<List<Booking>> getUserBookingHistory(@PathVariable Long userId) {
		return null;
	}

	@GetMapping("/{userId}/recommended-movies")
	public ResponseEntity<List<Movie>> getRecommendedMovies(@PathVariable Long userId) {
		return null;
	}
}
