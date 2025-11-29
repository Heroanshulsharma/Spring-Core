package org.springcore.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        System.out.println(context.getBean("teacher").hashCode());
        System.out.println(context.getBean("teacher").hashCode());
        System.out.println(context.getBean("teacher"));
    }
}
