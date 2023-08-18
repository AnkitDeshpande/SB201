package com.masai.service;

import java.util.List;

import com.masai.ui.Movie;

public interface MovieService {
	public List<Movie> getAllMovies();

	public void saveMovie(Movie movie);

	public void updateMovie(Movie movie);

	public void deleteMovie(Long id);
}
