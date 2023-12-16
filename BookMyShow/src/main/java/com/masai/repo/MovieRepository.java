package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}

