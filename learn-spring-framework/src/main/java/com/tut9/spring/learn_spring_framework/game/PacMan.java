package com.tut9.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsoleInterface {
	// Assuming there are four buttons in game up,down,left,right
	public void up() {
		System.out.println("PacMan jump");
	}
	public void down() {
		System.out.println("PacMan down");
	}
	public void left() {
		System.out.println("PacMan stop");
	}
	public void right() {
		System.out.println("PacMan accelerate");
	}
}
