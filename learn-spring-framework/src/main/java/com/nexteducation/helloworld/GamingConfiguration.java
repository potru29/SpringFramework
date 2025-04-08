package com.nexteducation.helloworld;

import org.springframework.context.annotation.Configuration;

import com.nexteducation.learn_spring_framework.game.GameRunner;
import com.nexteducation.learn_spring_framework.game.GamingConsole;
import com.nexteducation.learn_spring_framework.game.PacMan;

import org.springframework.context.annotation.Bean;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game=new PacMan();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}
	
}
