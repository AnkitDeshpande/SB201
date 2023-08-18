package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.service.EmpServiceImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		EmpServiceImpl esi = ac.getBean("empService", EmpServiceImpl.class);
		Emp emp = ac.getBean("emp", Emp.class);

		esi.add(emp);
		System.out.println(esi.show());
	}
}
