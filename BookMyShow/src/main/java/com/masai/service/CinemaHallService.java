package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.repo.CinemaHallRepository;

@Service
public class CinemaHallService {
    @Autowired
    private CinemaHallRepository repository;
    
}