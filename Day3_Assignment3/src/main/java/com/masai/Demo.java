package com.masai;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	private static Map<Department, Employee> theMap;

	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	public static void myInit() {
		System.out.println("inside myInit method");

	}

	public static void cleanUp() {
		System.out.println("inside cleanUp method");
	}

	public static void showDetails() {
		for (Map.Entry<Department, Employee> entry : theMap.entrySet()) {
			Department department = entry.getKey();
			Employee employee = entry.getValue();
			System.out.println("Department: " + department.toString());
			System.out.println("Employee: " + employee.toString());
		}

	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Demo d1 = ac.getBean("demo", Demo.class);
		showDetails();
		cleanUp();
	}
}
