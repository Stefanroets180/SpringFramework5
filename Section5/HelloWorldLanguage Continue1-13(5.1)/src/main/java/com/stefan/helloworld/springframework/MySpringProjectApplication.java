package com.stefan.helloworld.springframework;

import com.stefan.helloworld.springframework.controllers.MyController;
import com.stefan.helloworld.springframework.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MySpringProjectApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());
	}
}
