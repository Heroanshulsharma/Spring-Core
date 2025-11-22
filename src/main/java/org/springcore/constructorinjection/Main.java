package org.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    static void main() {
        ApplicationContext context= new ClassPathXmlApplicationContext("configConstructorInjection.xml");
        IO.println(context.getBean("Student"));
//        IO.println(context.getBean("AmbiguousString"));
//        IO.println(context.getBean("AmbiguousInteger"));
//        IO.println(context.getBean("AmbiguousDouble"));

    }


}
