package org.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("configAutowiringByAnnotation.xml");
        System.out.println(context.getBean("employee"));
        }
}
