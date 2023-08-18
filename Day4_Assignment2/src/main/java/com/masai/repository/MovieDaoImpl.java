package com.masai.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.masai.ui.Movie;

@Repository
public class MovieDaoImpl implements MovieDao {
	private List<Movie> movies = new ArrayList<>();

	@Override
	public List<Movie> getAllMovies() {
		return movies;
	}

	public Movie getMovieById(long id) {
		return movies.stream().filter(movie -> movie.getId() == id).findFirst().orElse(null);
	}

	@Override
	public void saveMovie(Movie movie) {
		movies.add(movie);
	}

	@Override
	public void updateMovie(Movie updatedMovie) {
		Movie existingMovie = getMovieById(updatedMovie.getId());
		if (existingMovie != null) {
			existingMovie.setTitle(updatedMovie.getTitle());
		}
	}

	@Override
	public void deleteMovie(Long id) {
		movies.removeIf(movie -> movie.getId() == id);
	}
}
