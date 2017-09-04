package com.lpa.didemo;

import com.lpa.didemo.controllers.AController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		AController controller = (AController) ctx.getBean("AController");

		controller.hello();
	}
}
