package annotations.components;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotations.components.xml");
        Employee myEmployee = context.getBean("myEmployee", Employee.class);
        System.out.println (myEmployee.toString());
    }
}
