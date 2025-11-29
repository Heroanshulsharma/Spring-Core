package org.springcore.autowiring.xml;

public class Employee {
    private String name;
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