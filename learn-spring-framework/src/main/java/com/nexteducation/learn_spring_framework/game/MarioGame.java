package com.nexteducation.learn_spring_framework.game;

public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("jump");
	}
	public void down() {
		System.out.println("into a hole");
	}
	public void left() {
		System.out.println("go back");
	}
	public void right() {
		System.out.println("Accerelate");
	}

}
