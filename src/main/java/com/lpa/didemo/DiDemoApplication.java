package com.lpa.didemo;

import com.lpa.didemo.controllers.AController;
import com.lpa.didemo.controllers.ConstructorInjectedController;
import com.lpa.didemo.controllers.SetterInjectedController;
import com.lpa.didemo.controllers.PropertyInjectedController;
import com.lpa.didemo.examplebeans.FakeDataSource;
import com.lpa.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		AController controller = (AController) ctx.getBean("AController");
		System.out.println(controller.hello());

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUser());

	}
}
