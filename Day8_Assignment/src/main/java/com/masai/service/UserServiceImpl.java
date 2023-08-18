package com.masai.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.masai.exception.InvalidEmailException;
import com.masai.exception.NotFoundException;
import com.masai.model.Like;
import com.masai.model.Retweet;
import com.masai.model.Tweet;
import com.masai.model.User;

import jakarta.annotation.PostConstruct;

public class UserServiceImpl implements UserService {

	private final Map<String, User> users = new HashMap<>();
	private final Map<String, Tweet> tweets = new HashMap<>();
	private final Map<String, Like> likes = new HashMap<>();
	private final Map<String, Retweet> retweets = new HashMap<>();

	@PostConstruct
	private void init() {
		System.out.println("Inside postConstruct method.");
		// Initialize hardcoded data here using the maps
		User user1 = new User("user1", "Rahul Sharma", "rahul@example.com");
		User user2 = new User("user2", "Priya Patel", "priya@example.com");
		User user3 = new User("user3", "Amit Khan", "amit@example.com");
		users.put(user1.getUserId(), user1);
		users.put(user2.getUserId(), user2);
		users.put(user3.getUserId(), user3);

		Tweet tweet1 = new Tweet("tweet1", "user1", "Hello, Twitter!");
		Tweet tweet2 = new Tweet("tweet2", "user2", "Excited to join Twitter!");
		tweets.put(tweet1.getTweetId(), tweet1);
		tweets.put(tweet2.getTweetId(), tweet2);

		Like like1 = new Like("like1", "user2", "tweet1");
		Like like2 = new Like("like2", "user3", "tweet1");
		likes.put(like1.getLikeId(), like1);
		likes.put(like2.getLikeId(), like2);

		Retweet retweet1 = new Retweet("retweet1", "user3", "tweet1");
		retweets.put(retweet1.getRetweetId(), retweet1);
	}

	@Override
	public ResponseEntity<User> addUser(User user) throws InvalidEmailException {
		if (user.getEmail() == null) {
			throw new InvalidEmailException("Email Cant be Empty.");
		}
		return new ResponseEntity<User>(users.put(user.getUserId(), user), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Tweet> createTweet(String userId, Tweet tweet) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Like> likeTweet(String userId, String tweetId) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Retweet> retweet(String userId, String tweetId) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Tweet>> getUserTweetHistory(String userId) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
