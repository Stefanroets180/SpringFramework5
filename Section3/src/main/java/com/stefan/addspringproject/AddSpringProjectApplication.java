package com.stefan.addspringproject;

import com.stefan.addspringproject.controllers.ConstructorInjectedController;
import com.stefan.addspringproject.controllers.MyController;
import com.stefan.addspringproject.controllers.PropertyInjectedController;
import com.stefan.addspringproject.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AddSpringProjectApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(AddSpringProjectApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("______Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("_________Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("_________Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("_____Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
