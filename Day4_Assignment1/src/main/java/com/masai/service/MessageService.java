package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.MessageDao;
import com.masai.ui.Message;

@Service
public class MessageService {
	private final MessageDao messageDAO;

	@Autowired
	public MessageService(MessageDao messageDAO) {
		this.messageDAO = messageDAO;
	}

	// Save a new message
	public void createMessage(Message message) {
		messageDAO.save(message);
	}

	// Find a message by its ID
	public Message getMessageById(long id) {
		return messageDAO.findById(id);
	}

	// Get all messages
	public List<Message> getAllMessages() {
		return messageDAO.findAll();
	}

	// Update an existing message
	public void updateMessage(long id, Message updatedMessage) {
		Message existingMessage = messageDAO.findById(id);
		if (existingMessage != null) {
			updatedMessage.setId(id);
			messageDAO.update(updatedMessage);
		}
	}

	// Delete a message by its ID
	public void deleteMessage(long id) {
		messageDAO.deleteById(id);
	}
}
