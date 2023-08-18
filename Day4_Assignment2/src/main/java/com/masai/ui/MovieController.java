package com.masai.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.service.MovieService;

@Controller
public class MovieController {
	private final MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}

	public void addMovie(Movie movie) {
		movieService.saveMovie(movie);
	}

	public void updateMovie(Movie updatedMovie) {
		movieService.updateMovie(updatedMovie);
	}

	public void deleteMovie(long id) {
		movieService.deleteMovie(id);
	}
}