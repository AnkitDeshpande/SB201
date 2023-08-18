package com.masai.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.service.MovieService;
import com.masai.service.MovieServiceImpl;
import com.masai.service.SeriesService;
import com.masai.service.SeriesServiceImpl;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		// Get the MovieService bean
		MovieService movieService = ac.getBean("movieServiceImpl", MovieServiceImpl.class);

		// Get the SeriesService bean
		SeriesService seriesService = ac.getBean("seriesServiceImpl", SeriesServiceImpl.class);

		// Call methods using service classes

		// Add movies
		movieService.saveMovie(new Movie(1L, "Movie 1"));
		movieService.saveMovie(new Movie(2L, "Movie 2"));

		// Get all movies and print them
		System.out.println("All Movies:");
		movieService.getAllMovies().forEach(System.out::println);

		// Update a movie
		Movie updatedMovie = new Movie(1L, "Updated Movie 1");
		movieService.updateMovie(updatedMovie);

		// Get the updated movie and print it
		System.out.println("Updated Movie:");

		// Delete a movie
		movieService.deleteMovie(2L);

		// Get all movies after deletion and print them
		System.out.println("All Movies after Deletion:");
		movieService.getAllMovies().forEach(System.out::println);

		// Add series
		seriesService.saveSeries(new Series(1L, "Series 1"));
		seriesService.saveSeries(new Series(2L, "Series 2"));

		// Get all series and print them
		System.out.println("All Series:");
		seriesService.getAllSeries().forEach(System.out::println);

		// Update a series
		Series updatedSeries = new Series(1L, "Updated Series 1");
		seriesService.updateSeries(updatedSeries);

		// Get the updated series and print it
		System.out.println("Updated Series:");

		// Delete a series
		seriesService.deleteSeries(2L);

		// Get all series after deletion and print them
		System.out.println("All Series after Deletion:");
		seriesService.getAllSeries().forEach(System.out::println);

		ac.close();
	}
}
