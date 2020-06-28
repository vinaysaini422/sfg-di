package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting =myController.sayHello();
        System.out.println(greeting);

        System.out.println("-------------------- Primary Controller -----------------------");
        PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");
        System.out.println(primaryController.getGreeting());

        System.out.println("-------------------- I18n Controller -----------------------");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.getGreeting());

        System.out.println("-------------------- Property Injection -----------------------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------------------- Setter Injection -----------------------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------------------- Constructor Injection -----------------------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println();

	}

}
