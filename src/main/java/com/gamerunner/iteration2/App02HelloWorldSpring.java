package com.gamerunner.iteration2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		// 1: Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2: Configure the things that we want Spring to manage - @Configuration
		var name = context.getBean("name");
		System.out.println(name);

		var age = context.getBean("age");
		System.out.println(age);

		var person = context.getBean("person");
		System.out.println(person);

//		System.out.println(context.getBean(Person.class));

		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
	}
}
