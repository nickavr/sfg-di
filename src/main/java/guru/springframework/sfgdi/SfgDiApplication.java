package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args); //this returns the app context

		MyController myController = (MyController) ctx.getBean("myController"); //using the context we can get any bean that spring created (classes with a particular annotation like controller, service, entity etc.)
		//the name of the bean is class name with lower first letter.

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("_______Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("______Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("______Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
