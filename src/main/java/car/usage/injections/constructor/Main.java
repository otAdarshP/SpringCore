package car.usage.injections.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructionInjection.xml");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
