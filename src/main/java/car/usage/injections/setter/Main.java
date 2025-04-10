package car.usage.injections.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationSetterInjection.xml");
        Car myPersonalCar = (Car) context.getBean("myPersonalCar");
        myPersonalCar.displayDetails();
    }
}
