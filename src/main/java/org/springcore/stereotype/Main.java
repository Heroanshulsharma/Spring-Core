package org.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String ...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configStereo.xml");
        System.out.println(context.getBean("employee"));
    }
}
