package com.gamerunner.iteration3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gamerunner.GamingConfiguration;
import com.gamerunner.game.GamingConsole;
import com.gamerunner.iteration1.GameRunner;

public class App03GamingSpringBeans {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);) {
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}
}
