package com.gamerunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gamerunner.game.GamingConsole;
import com.gamerunner.game.MarioGame;
import com.gamerunner.iteration1.GameRunner;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
