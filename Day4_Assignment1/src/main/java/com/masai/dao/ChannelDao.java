package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.masai.ui.Channel;

@Repository
public class ChannelDao {
	private List<Channel> channels = new ArrayList<>();

	// Save a new channel
	public void save(Channel channel) {
		channels.add(channel);
	}

	// Find a channel by its ID
	public Channel findById(long id) {
		return channels.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
	}

	// Get all channels
	public List<Channel> findAll() {
		return channels;
	}

	// Update an existing channel
	public void update(Channel updatedChannel) {
		Channel c1 = findById(updatedChannel.getId());
		if (c1 != null) {
			c1.setName(updatedChannel.getName());
			c1.setDescription(updatedChannel.getDescription());
		}
	}

	// Delete a channel by its ID
	public void deleteById(long id) {
		channels.removeIf(ch -> ch.getId() == id);
	}

}
