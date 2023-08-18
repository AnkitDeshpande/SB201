package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.User;
import com.masai.service.UserService;
import com.masai.service.UserServiceImpl;

@RestController
public class UserController {
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userService.getAllUsers();
		if (users.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		UserService userSerVice = new UserServiceImpl();
		return userService.addUser(user);
	}

//    @PostMapping("/users/{userId}/tweets")
//    public ResponseEntity<Tweet> createTweet(@PathVariable String userId, @RequestBody Tweet tweet) {
//        
//    }
//
//    @PostMapping("/{userId}/tweets/{tweetId}/likes")
//    public ResponseEntity<Like> likeTweet(@PathVariable String userId, @PathVariable String tweetId) {
//        
//    }
//
//    @PostMapping("/{userId}/tweets/{tweetId}/retweets")
//    public ResponseEntity<Retweet> retweet(@PathVariable String userId, @PathVariable String tweetId) {
//        
//    }
//
//    @GetMapping("/{userId}/tweets")
//    public ResponseEntity<List<Tweet>> getUserTweetHistory(@PathVariable String userId) {
//        
//    }
}
