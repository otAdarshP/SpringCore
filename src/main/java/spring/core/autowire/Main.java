package spring.core.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByType.xml");
        Company myCompany = (Company) context.getBean("myCompany");
        myCompany.displayDetails();;
    }
}
