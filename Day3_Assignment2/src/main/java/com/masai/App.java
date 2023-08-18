package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(CalcConfig.class);
		Calculator bean = ac.getBean(Calculator.class);
		System.out.println(bean.add(10, 20));
		System.out.println(bean.subtract(100, 20));
		System.out.println(bean.multiply(50, 2));
		System.out.println(bean.divide(100, 10));
	}
}
