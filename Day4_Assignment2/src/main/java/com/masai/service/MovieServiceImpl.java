package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.masai.repository.MovieDao;
import com.masai.ui.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private final MovieDao movieDao;

	@Autowired
	public MovieServiceImpl(@Qualifier("movieDaoImpl") MovieDao movieDao) {
		this.movieDao = movieDao;
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieDao.getAllMovies();
	}

	@Override
	public void saveMovie(Movie movie) {
		movieDao.saveMovie(movie);
	}

	@Override
	public void updateMovie(Movie updatedMovie) {
		movieDao.updateMovie(updatedMovie);
	}

	@Override
	public void deleteMovie(Long id) {
		movieDao.deleteMovie(id);
	}

}
