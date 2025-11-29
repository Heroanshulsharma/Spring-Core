package org.springcore.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class SpringInterfaceLifeCycleBean  implements InitializingBean, DisposableBean {

    private String value;

    public String value() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SpringInterfaceLifeCycleBean{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method via spring interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method via spring interface");
    }
}
