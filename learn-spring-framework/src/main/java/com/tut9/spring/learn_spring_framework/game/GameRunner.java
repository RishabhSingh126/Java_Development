package com.tut9.spring.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsoleInterface game;
	
	public GameRunner(GamingConsoleInterface game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
