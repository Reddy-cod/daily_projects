package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Greetings greeting1 = (Greetings) context.getBean("greeting");
        System.out.println("Hello " + greeting1.getName());
        greeting1.setName("ICSer");
        Greetings greeting2=(Greetings)context.getBean("greeting");
        System.out.println("Hello " + greeting1.getName());
        System.out.println("Hello " + greeting2.getName());
         context.registerShutdownHook();
        System.out.println("End");
    }
}
