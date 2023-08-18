package com.masai;

public class ContentService {
	private UserService userService;

	public ContentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContentService(UserService userService) {
		super();
		this.userService = userService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
