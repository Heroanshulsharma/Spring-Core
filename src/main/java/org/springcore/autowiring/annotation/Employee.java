package org.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private String name;

    @Autowired
    @Qualifier("manager2")
    private Manager manager;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager manager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }
}