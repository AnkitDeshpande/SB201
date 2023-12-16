package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Screen;

public interface ScreenRepository extends JpaRepository<Screen, Long> {
}

