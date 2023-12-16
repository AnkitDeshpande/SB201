package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.repo.MovieRepository;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;
    
}

