package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.repo.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    
}

