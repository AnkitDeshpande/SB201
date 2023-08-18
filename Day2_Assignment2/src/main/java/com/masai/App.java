package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		UserService us = context.getBean("userService", UserService.class);
		us.login("Ankit");
		us.getRecommendationService();
	}
}
