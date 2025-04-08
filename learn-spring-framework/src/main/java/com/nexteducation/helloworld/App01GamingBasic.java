package com.nexteducation.helloworld;

import com.nexteducation.learn_spring_framework.game.GameRunner;
import com.nexteducation.learn_spring_framework.game.PacMan;
public class App01GamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var game=new PacMan();
		var gameRunner=new GameRunner(game);
		gameRunner.run();
		

	}

}
