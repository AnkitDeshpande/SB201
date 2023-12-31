package com.masai.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
}
