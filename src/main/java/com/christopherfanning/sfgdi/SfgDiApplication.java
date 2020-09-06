package com.christopherfanning.sfgdi;

//import com.christopherfanning.sfgdi.controllers;
import com.christopherfanning.sfgdi.controllers.ConstructorInjectedController;
import com.christopherfanning.sfgdi.controllers.MyController;
import com.christopherfanning.sfgdi.controllers.PropertyInjectedController;
import com.christopherfanning.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);


		MyController myController = (MyController) ctx.getBean("myController");

//		String greeting = myController.sayHello();

		System.out.println("----PRIMARY	");
		System.out.println(myController.sayHello());

		System.out.println("-------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("-------------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------------------- Constructor");  // This is the preferred way of doing Dependency Injection.

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
