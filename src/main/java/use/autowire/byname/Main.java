package use.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringByName.xml");
        ClassName newClassName = (ClassName);
    }
}
