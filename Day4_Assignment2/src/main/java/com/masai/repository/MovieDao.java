package com.masai.repository;

import java.util.List;

import com.masai.ui.Movie;

public interface MovieDao {
	public List<Movie> getAllMovies();

	public void saveMovie(Movie movie);

	public void updateMovie(Movie movie);

	public void deleteMovie(Long id);
}
