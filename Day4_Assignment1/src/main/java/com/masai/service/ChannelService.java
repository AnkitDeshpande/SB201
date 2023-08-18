package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.ChannelDao;
import com.masai.ui.Channel;

@Service
public class ChannelService {
	private final ChannelDao channelDAO;

	@Autowired
	public ChannelService(ChannelDao channelDAO) {
		this.channelDAO = channelDAO;
	}

	// Save a new channel
	public void createChannel(Channel channel) {
		channelDAO.save(channel);
	}

	// Find a channel by its ID
	public Channel getChannelById(long id) {
		return channelDAO.findById(id);
	}

	// Get all channels
	public List<Channel> getAllChannels() {
		return channelDAO.findAll();
	}

	// Update an existing channel
	public void updateChannel(long id, Channel updatedChannel) {
		Channel existingChannel = channelDAO.findById(id);
		if (existingChannel != null) {
			updatedChannel.setId(id);
			channelDAO.update(updatedChannel);
		}
	}

	// Delete a channel by its ID
	public void deleteChannel(long id) {
		channelDAO.deleteById(id);
	}
}
