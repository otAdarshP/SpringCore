package com.student.details;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
        ApplicationContext gatepass = new ClassPathXmlApplicationContext("gatepass.xml");
        GatePass StudentGatePass = (GatePass) gatepass.getBean("StudentGatePass");
        StudentGatePass.displayDetails();
    }

}