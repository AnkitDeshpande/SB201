package com.masai.ui;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.service.ChannelService;
import com.masai.service.MessageService;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

		// Retrieve the beans for ChannelService and MessageService
		ChannelService channelService = ac.getBean(ChannelService.class);
		MessageService messageService = ac.getBean(MessageService.class);

		// Create and add a few more channels
		Channel channel1 = new Channel(4, "HR202", "Human Resources");
		Channel channel2 = new Channel(5, "DEV301", "Development Team");
		channelService.createChannel(channel1);
		channelService.createChannel(channel2);

		// Get all channels and print them
		System.out.println("All Channels:");
		channelService.getAllChannels().forEach(System.out::println);

		// Update an existing channel
		Channel updatedChannel = new Channel(1, "SB201 - Updated", "Final unit - Updated");
		channelService.updateChannel(1, updatedChannel);

		// Get the updated channel and print it
		Channel retrievedChannel = channelService.getChannelById(1);
		System.out.println("Updated Channel: " + retrievedChannel);

		// Delete a channel by its ID
		channelService.deleteChannel(2);

		// Get all channels again after deletion and print them
		System.out.println("All Channels after Deletion:");
		channelService.getAllChannels().forEach(System.out::println);

		// Create and add a few messages
		messageService.createMessage(new Message(1, "Welcome to MicroSlack!", "Admin", LocalDate.now()));
		messageService.createMessage(new Message(2, "How's everyone doing?", "Ankit", LocalDate.now()));
		messageService.createMessage(new Message(3, "Great to be here!", "Sanket", LocalDate.now()));

		// Get all messages and print them
		System.out.println("All Messages:");
		messageService.getAllMessages().forEach(System.out::println);

		// Update an existing message
		messageService.updateMessage(1, new Message(1, "Welcome to MicroSlack - Updated", "Admin", LocalDate.now()));

		// Get the updated message and print it
		System.out.println("Updated Message: " + messageService.getMessageById(1));

		// Delete a message by its ID
		messageService.deleteMessage(3);

		// Get all messages again after deletion and print them
		System.out.println("All Messages after Deletion:");
		messageService.getAllMessages().forEach(System.out::println);
		
		
		

	}
}
