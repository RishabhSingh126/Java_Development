package com.tut9.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tut9.spring.learn_spring_framework.enterprises.web.MyWebController;
import com.tut9.spring.learn_spring_framework.game.GameRunner;

@SpringBootApplication

//This is to scan packages
//@ComponentScan("com.tut9.spring.learn_spring_framework;")

// Thus is used to scan more than one packages
//@ComponentScan({"package1", "package2"})

public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		//MarioGame game = new MarioGame();
		//SuperContraGame game= new SuperContraGame();
		//PacMan game = new PacMan();
		
		// Commenting these two lines because these will managed by Spring (@Component, @Autowired, Application Context)
		
		//GamingConsoleInterface game = new MarioGame();
		//GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
