package componentscan.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main (String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(configEmp.class); //this is class-passing. for passing the complete package (better for production level codes) put the package in " ".
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());
    }
}
