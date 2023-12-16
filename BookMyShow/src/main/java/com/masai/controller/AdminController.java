package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.masai.service.BookingService;
import com.masai.service.CinemaHallService;
import com.masai.service.MovieService;
import com.masai.service.ScreenService;
import com.masai.service.UserService;

@RestController
public class AdminController {
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


}
