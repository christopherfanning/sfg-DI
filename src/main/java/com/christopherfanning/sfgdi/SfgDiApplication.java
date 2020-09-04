package com.christopherfanning.sfgdi;

//import com.christopherfanning.sfgdi.controllers;
import com.christopherfanning.sfgdi.controllers.MyController;
import com.christopherfanning.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

//		MyController myController = (MyController) ctx.getBean("myController");
//
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("-------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

	}

}
