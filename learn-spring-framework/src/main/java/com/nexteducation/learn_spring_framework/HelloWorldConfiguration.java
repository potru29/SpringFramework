package com.nexteducation.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age) {};
record Address(String firstline,String city) {};
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "sandhya";
	}
	@Bean
	public int age() {
		return 15;
	}
	@Bean
	public Person person() {
		return new Person("indu",17);
	}
	@Bean(name="addresss")
	public Address address() {
		return new Address("subash road","sangareddy");
	}
	

}
