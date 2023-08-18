package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		PaymentPresentation pp = ac.getBean("paymentPresentation", PaymentPresentation.class);
		pp.transfer(15000);
	}
}
