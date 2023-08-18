package com.masai.ui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.masai.dao.ChannelDao;
import com.masai.dao.MessageDao;
import com.masai.service.ChannelService;
import com.masai.service.MessageService;

@Configuration
public class Config {
	@Bean
	public ChannelDao channelDAO() {
		return new ChannelDao();
	}

	@Bean
	public MessageDao messageDAO() {
		return new MessageDao();
	}

	@Bean
	public ChannelService channelService() {
		return new ChannelService(channelDAO());
	}

	@Bean
	public MessageService messageService() {
		return new MessageService(messageDAO());
	}
}
