package com.gamerunner.iteration2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Shivam";
	}

	@Bean
	public int age() {
		return 15;
	}

	@Bean
	public Person person() {
		return new Person("Shiva", 6);
	}

	// Relation between beans
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age());
	}

	@Bean
	public Person person3Parameters(String name, int age) {
		return new Person(name, age);
	}
}
