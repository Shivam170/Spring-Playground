package com.gamerunner.iteration1;

import com.gamerunner.game.GamingConsole;

public class GameRunner {
	GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;

	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
