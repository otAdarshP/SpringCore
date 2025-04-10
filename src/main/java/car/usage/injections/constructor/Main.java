package car.usage.injections.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
//        ApplicationContext is the Spring container that manages the lifecycle and dependencies of the bean.
//        ClassPathXmlApplicationContext is the implementation of ApplicationContext with reads the XML config from the path.
        ApplicationContext contextOfFile = new ClassPathXmlApplicationContext("applicationConstructionInjection.xml");
        Car myCar = (Car) contextOfFile.getBean("myCar");
        myCar.displayDetails();
    }
}
