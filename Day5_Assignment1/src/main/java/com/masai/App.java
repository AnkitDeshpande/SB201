package com.masai;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EventOrganizer eo = ac.getBean(EventOrganizer.class);
		eo.findArtist("singer");
		ac.close();
	}
}
