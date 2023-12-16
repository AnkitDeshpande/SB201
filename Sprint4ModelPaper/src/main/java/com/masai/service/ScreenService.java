package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.repo.ScreenRepository;

@Service
public class ScreenService {
    @Autowired
    private ScreenRepository repository;
    
}

