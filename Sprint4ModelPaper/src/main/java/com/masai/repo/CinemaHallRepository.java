package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.CinemaHall;

public interface CinemaHallRepository extends JpaRepository<CinemaHall, Long> {
}

