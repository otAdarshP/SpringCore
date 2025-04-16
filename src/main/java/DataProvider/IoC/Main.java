package DataProvider.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){

        ApplicationContext api = new ClassPathXmlApplicationContext("ApplicationBeanIOC.xml");
        UserManager APImanager = (UserManager) api.getBean("UserManagerWithAPIProvider");
        System.out.println(APImanager.getUserDetails());

        ApplicationContext web = new ClassPathXmlApplicationContext("ApplicationBeanIOC.xml");
        UserManager Webmanager = (UserManager) web.getBean("UserManagerWithWebProvider"); // UserManager implementing the call for WebdataProvider through the beans.
        System.out.println(Webmanager.getUserDetails());

        ApplicationContext newDB = new ClassPathXmlApplicationContext("ApplicationBeanIOC.xml");
        UserManager DBmanager = (UserManager) newDB.getBean("UserManagerWithNewProvider");
        System.out.println(DBmanager.getUserDetails());


    }

}
