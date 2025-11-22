package org.springcore.reference;

public class Class2 {
    private  String name;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "name='" + name + '\'' +
                '}';
    }
}
