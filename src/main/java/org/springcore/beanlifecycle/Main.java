package org.springcore.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    static void main() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configBeanLifeCycle.xml");
        System.out.println(context.getBean("Student"));
        System.out.println(context.getBean("LifeCycleInterfaceBean"));
        context.registerShutdownHook();
    }
}
