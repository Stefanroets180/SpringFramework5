package com.stefan.addspringproject;

import com.stefan.addspringproject.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AddSpringProjectApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(AddSpringProjectApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
