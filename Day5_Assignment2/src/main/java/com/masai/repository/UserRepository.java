package com.masai.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.masai.model.Event;
import com.masai.model.User;

@Repository
public class UserRepository {
	private Map<Long, User> userMap = new HashMap<>();

	public User save(User user) {
		userMap.put(user.getUserId(), user);
		return user;
	}

	public User findById(Long userId) {
		return userMap.get(userId);
	}

	public List<User> findAll() {
		return new ArrayList<>(userMap.values());
	}

	public void update(User user) {
		userMap.put(user.getUserId(), user);
	}

	public void deleteById(Long userId) {
		userMap.remove(userId);
	}

	public List<Event> getEventsByUsername(String username) {
		return null;
	}
}