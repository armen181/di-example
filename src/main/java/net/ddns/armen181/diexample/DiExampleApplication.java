package net.ddns.armen181.diexample;

import net.ddns.armen181.diexample.controllers.ConstructorInjectedController;
import net.ddns.armen181.diexample.controllers.MyController;
import net.ddns.armen181.diexample.controllers.PropertyInjectedController;
import net.ddns.armen181.diexample.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

    public static void main(String[] args) {
      ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
    controller.hello();
        System.out.printf(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.printf(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.printf(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
