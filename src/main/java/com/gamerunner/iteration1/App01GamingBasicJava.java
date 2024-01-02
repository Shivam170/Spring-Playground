package com.gamerunner.iteration1;

import com.gamerunner.game.SuperContraGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {
		//Tight coupling : To run super contragame we have to do some code changes
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}
}
