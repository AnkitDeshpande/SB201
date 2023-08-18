package com.masai.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.masai.exception.InvalidEmailException;
import com.masai.exception.NotFoundException;
import com.masai.model.Like;
import com.masai.model.Retweet;
import com.masai.model.Tweet;
import com.masai.model.User;

public interface UserService {
	ResponseEntity<User> addUser(User user) throws InvalidEmailException;

	ResponseEntity<Tweet> createTweet(String userId, Tweet tweet) throws NotFoundException;

	ResponseEntity<Like> likeTweet(String userId, String tweetId) throws NotFoundException;

	ResponseEntity<Retweet> retweet(String userId, String tweetId) throws NotFoundException;

	ResponseEntity<List<Tweet>> getUserTweetHistory(String userId) throws NotFoundException;

	List<User> getAllUsers() throws NotFoundException;
}
