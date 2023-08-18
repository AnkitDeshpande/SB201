package com.masai.ui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.masai.repository.MovieDao;
import com.masai.repository.MovieDaoImpl;
import com.masai.repository.SeriesDao;
import com.masai.repository.SeriesDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {
//	// Bean for MovieDao
//	@Bean
//	public MovieDao movieDao() {
//		return new MovieDaoImpl();
//	}
//
//	// Bean for SeriesDao
//	@Bean
//	public SeriesDao seriesDao() {
//		return new SeriesDaoImpl();
//	}
}
