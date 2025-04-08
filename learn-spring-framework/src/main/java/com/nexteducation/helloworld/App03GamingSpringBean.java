package com.nexteducation.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nexteducation.learn_spring_framework.game.GameRunner;
import com.nexteducation.learn_spring_framework.game.GamingConsole;
public class App03GamingSpringBean{
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} 

		
	}
}

