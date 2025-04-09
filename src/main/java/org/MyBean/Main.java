package org.MyBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        FirstBean firstBean = (FirstBean) context.getBean("FirstBean");
        System.out.println (firstBean);
    }
}
