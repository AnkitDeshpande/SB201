package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.masai.ui.Message;

@Repository
public class MessageDao {
	private List<Message> messages = new ArrayList<>();

	// Save a new message
	public void save(Message message) {
		messages.add(message);
	}

	// Find a message by its ID
	public Message findById(long id) {
		return messages.stream().filter(message -> message.getId() == id).findFirst().orElse(null);
	}

	// Get all messages
	public List<Message> findAll() {
		return messages;
	}

	// Update an existing message
	public void update(Message updatedMessage) {
		Message existingMessage = findById(updatedMessage.getId());
		if (existingMessage != null) {
			existingMessage.setContent(updatedMessage.getContent());
			existingMessage.setAuthor(updatedMessage.getAuthor());
			existingMessage.setTimestamp(updatedMessage.getTimestamp());
		}
	}

	// Delete a message by its ID
	public void deleteById(long id) {
		messages.removeIf(message -> message.getId() == id);
	}
}
